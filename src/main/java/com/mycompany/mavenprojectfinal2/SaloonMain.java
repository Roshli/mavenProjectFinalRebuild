/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;

//import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Roshli
 */
@SpringBootApplication
public class SaloonMain {
    public static void main(String[] args) {
//            int exit = -99;
//           ApplicationContext ctx = new AnnotationConfigApplicationContext(SaloonConfig.class);
//            Customer customer = ctx.getBean(Customer.class);
//            ManageSaloon mCustomer = ctx.getBean(ManageSaloon.class);
//    
//    while(exit !=  0)
//        {
//            System.out.println("Select Option");
//            System.out.println("1.Enter Customer");
//            System.out.println("2.View Customer");
//            System.out.println("0.Exit");
//            
//            Scanner reader = new Scanner(System.in);
//            int option = reader.nextInt();
//            
//            switch(option){
//                case 1:
//                    
//                    System.out.println("Enter customer's Telephone Number");
//                    int tpNo = reader.nextInt();
//                    customer.setTpNumber(tpNo);
//                    
//                    System.out.println("Enter customer's Name");
//                    String name = reader.next();
//                    customer.setName(name);
//                    
//                    System.out.println("Enter customer's Age");
//                    int age = reader.nextInt();
//                    customer.setAge(age);
//                    
//                    System.out.println("Enter customer's Address");
//                    String address = reader.next();
//                    customer.setAddress(address);
//                    
//                    System.out.println("Enter customer's Email");
//                    String email = reader.next();
//                    customer.setEmail(email);
//                    mCustomer.insertCustomer(customer);
//                    
//                    break;
//                case 2:
//                    System.out.println("Enter Customer's Telephone Number");
//                    int tpNum = reader.nextInt();
//                    
//                    customer = mCustomer.viewCustomer(tpNum);
//                    
//                    //mCustomer.viewCustomer(tpNum);
//                    System.out.print(customer.getTpNumber()+"\t");
//                    System.out.print(customer.getName()+"\t");
//                    System.out.print(customer.getAge()+"\t");
//                    System.out.print(customer.getAddress()+"\t");
//                    System.out.println(customer.getEmail());
//                    break;
//                case 0:
//                    exit = 0;
//                    mCustomer.connectionClose();
//                    break;
//                default:
//                exit = 0;
//                mCustomer.connectionClose();
//                
//           }
//                          
//        }
//            
//  

        SpringApplication.run(SaloonMain.class, args);
    }
}
    

