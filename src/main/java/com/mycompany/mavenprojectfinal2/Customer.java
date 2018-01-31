/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectfinal2;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Roshli
 */

@Entity
public class Customer {
        @Id
        private int tpNumber;
        private String name;
        private int age;
        private String address;
        private String email;

        public Customer(int mTpNumber, String mName, int mAge, String mAddress, String mEmail)
        {
            this.tpNumber = mTpNumber;
            this.name = mName;
            this.age = mAge;
            this.address = mAddress;
            this.email = mEmail;

        }
        public Customer()
        {}

        public int getTpNumber()
        {
            return tpNumber;
        }
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public String getAddress()
        {
            return address;
        }
        public String getEmail()
        {
            return email;
        }

        public void setTpNumber(int tpNo)
        {
            tpNumber = tpNo;
        }
        public void setName(String sname)
        {
            name = sname;
        }
        public void setAge(int sage)
        {
            age = sage;
        }
        public void setAddress(String saddress)
        {
            address = saddress;
        }
        public void setEmail(String semail)
        {
            email = semail;
        }
    
}
