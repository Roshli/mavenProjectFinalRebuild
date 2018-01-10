/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Roshli
 */
public class DbConn {
     public static Connection connect()
    {
       Connection cnct =null; 
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnct = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/saloon_mevan?autoReconnect=true&useSSL=false","root","");
        } catch (Exception e) {
            System.out.println("No connection to the database");
            System.out.println(e);
        }
        
        return cnct;
        
    }
}
