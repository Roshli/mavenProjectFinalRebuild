/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roshli
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ManageSaloon customerManage;
    
    private Customer customer4 = new Customer();
    
    @RequestMapping(value = "/{tpNo}", method = RequestMethod.GET)
    public Customer viewCustomer(@PathVariable("tpNo") int tpNo)
    {
      customer4 = customerManage.viewCustomer(tpNo);

        return customer4;
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCustomer(@RequestBody Customer customer)
    {
        
        customerManage.insertCustomer(customer);
    }
}
