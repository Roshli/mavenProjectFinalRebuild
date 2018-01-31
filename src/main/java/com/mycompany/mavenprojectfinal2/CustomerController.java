/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roshli
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ManageSaloon customerManage;
    
    List<Customer> customer4 = new ArrayList<Customer>();
    Customer customerUpde = new Customer();
    
    @RequestMapping(value = "/{tpNo}", method = RequestMethod.GET)
   // @CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
    public List<Customer> viewCustomer(@PathVariable("tpNo") int tpNo)
    {
        customer4.clear();
      customer4.add(customerManage.viewCustomer(tpNo));

        return customer4;
    }
    
    @RequestMapping(value = "/Customers", method = RequestMethod.GET)
   // @CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
    public List<Customer> viewCustomers()
    {
        //customer4.clear();
      customer4 = customerManage.viewCustomers();

        return customer4;
    }
    
    
//    @RequestMapping(value = "cus/{tpNo2}", method = RequestMethod.GET)
//    // @CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
//    public Customer mapCustomer(@PathVariable("tpNo2") int tpNo2)
//    {
//        customerUpde = customerManage.viewCustomer(tpNo2);
//
//        return customerUpde;
//    }
    
    
    @RequestMapping(method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer)
    {
        customerManage.updateCustomer(customer);
    }
    

   @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType. APPLICATION_JSON_VALUE)
    public void insertCustomer(@RequestBody Customer customer)
    {
        
        customerManage.insertCustomer(customer);
    }
}
