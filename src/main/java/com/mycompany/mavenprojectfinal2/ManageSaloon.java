/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Roshli
 */
@Service
public class ManageSaloon {
    
    Customer customer4 = new Customer();
    
    CustomerDao customer2 = new CustomerDaoImpl();
    
    
    public void insertCustomer(Customer customer)
    {
        customer2.insertCustomer(customer);
    }
    public Customer viewCustomer(int tpNo)
    {
      customer4 = customer2.getCustomer(tpNo);

        return customer4;
    }
    public void connectionClose()
    {
        customer2.closeConnection();
        
    }
}
