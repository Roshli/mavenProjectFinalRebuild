/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;

import com.mycompany.DbConnection.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Roshli
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{
    Connection con = null;
    
    public CustomerDaoImpl()
    {
        con = DbConn.connect();
    }
    
    String sql1 ="Insert Into customer (TpNumber, Name, Age, Address, Email) VALUES (?,?,?,?,?)";
    String sql2 = "SELECT TpNumber, Name, Age,Address, Email From customer Where TpNumber = ?";
   
    public Customer getCustomer(int tpNo)
    {
         Customer customer = new Customer();
        customer.setTpNumber(tpNo);
        PreparedStatement pst = null;
        ResultSet rs = null;
       
            
        try {
            pst = con.prepareStatement(sql2);
            pst.setInt(1,tpNo);
            rs  = pst.executeQuery();
            //ResultSetMetaData rsmd = rs.getMetaData();
            //int columnsNumber = rsmd.getColumnCount();
            while(rs.next())
            {
               // for(int i = 1 ; i <= columnsNumber; i++)
                    
                    int TpNo = rs.getInt(1);
                    String name = rs.getString(2);
                    int age = rs.getInt(3);
                    String address = rs.getString(4);
                    String email = rs.getString(5);
                    customer.setTpNumber(TpNo);
                    customer.setName(name);
                    customer.setAge(age);
                    customer.setAddress(address);
                    customer.setEmail(email);  
            
            }
        } catch (SQLException ex) {
           // Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                //con.close();
                pst.close();
                rs.close();
            } catch (SQLException ex) {
              //  Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
        return customer;
        
    
    }
    public void insertCustomer (Customer c)
    {
        PreparedStatement pst = null;

        
        try {
            pst = con.prepareStatement(sql1);
            pst.setInt(1,c.getTpNumber());
            pst.setString(2, c.getName());
            pst.setInt(3, c.getAge());
            pst.setString(4, c.getAddress());
            pst.setString(5, c.getEmail());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }    
        finally
        {
            try {
               // con.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    public void closeConnection()
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
