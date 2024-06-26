package com.flipkart.business;

import com.flipkart.bean.Customer;


public class CustomerBussiness implements CustomerInterface{

        public void createCustomer(){
            System.out.println("Creating new customer...");
        }
        public boolean updateCustomer(int customerId){
            System.out.println("Customer is updated by id --->" + customerId );
            return true;
        }
        public boolean deleteCustomer(int customerId){
            System.out.println("Customer is deleted by id --->" + customerId );
            return true;
        }
        public void listCustomer(){
            System.out.println("Listing all customers...");
        }
}
