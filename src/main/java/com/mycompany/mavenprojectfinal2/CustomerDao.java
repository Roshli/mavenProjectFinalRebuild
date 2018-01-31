/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;

import java.util.List;




/**
 *
 * @author Roshli
 */
//@Repository
public interface CustomerDao {
   
    public Customer getCustomer(int tpNo);
    public void insertCustomer (Customer c);
    public void closeConnection();
    public List<Customer> getCustomers();
    public void updateCustomer (Customer c);
    
}
