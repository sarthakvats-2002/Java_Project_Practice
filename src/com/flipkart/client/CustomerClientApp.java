package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

public class CustomerClientApp {
    public static void main(String[] args) {
        CustomerInterface service = new CustomerBusiness();

        service.createCustomer();
        System.out.println("updated customer--->" + service.updateCustomer(101, "Sarthak", "sbuwgdwuy"));
        System.out.println("deleted customer--->" + service.deleteCustomer(101));
        service.listCustomer();
    }
}

