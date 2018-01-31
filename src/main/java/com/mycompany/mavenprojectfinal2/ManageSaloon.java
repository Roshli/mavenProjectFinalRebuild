/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Roshli
 */
@Service
public class ManageSaloon {
    
    Customer customer4 = new Customer();
    List<Customer> customer5 = new ArrayList<Customer>();
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
    public List<Customer> viewCustomers()
    {
        customer5 = customer2.getCustomers();
        return customer5;
    }
    public void connectionClose()
    {
        customer2.closeConnection();
        
    }
    public void updateCustomer(Customer customer)
    {
        customer2.updateCustomer(customer);
    }
}
