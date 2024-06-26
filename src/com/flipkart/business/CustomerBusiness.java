package com.flipkart.business;

import com.flipkart.bean.Customer;


public class CustomerBusiness implements CustomerInterface {

    Customer[] customer = new Customer[3];

    public void createCustomer() {
        System.out.println("Creating new customer...");
        // Add first record
        customer[0] = new Customer();
        customer[0].setCustomerId(101);
        customer[0].setCustomerName("affaa");
        customer[0].setCustomerAddress("Blr");

        // Add second record
        customer[1] = new Customer();
        customer[1].setCustomerId(102);
        customer[1].setCustomerName("affaanjdkf");
        customer[1].setCustomerAddress("Bldejior");

        // Add third record
        customer[2] = new Customer();
        customer[2].setCustomerId(103);
        customer[2].setCustomerName("affafecna");
        customer[2].setCustomerAddress("Beaaalr");

    }

    public boolean updateCustomer(int customerId, String newName, String newAddress) {
        for (Customer customer : customer) {
            if (customer != null && customer.getCustomerId() == customerId) {
                System.out.println("Updating customer with ID: " + customerId);
                customer.setCustomerName(newName);
                customer.setCustomerAddress(newAddress);
                return true; // Return true if update is successful
            }
        }
        System.out.println("Customer with ID " + customerId + " not found.");
        return false; // Return false if customer not found or update fails
    }

    public boolean deleteCustomer(int customerId) {
        for (int i = 0; i < customer.length; i++) {
            if (customer[i] != null && customer[i].getCustomerId() == customerId) {
                System.out.println("Deleting customer with ID: " + customerId);
                customer[i] = null;
                return true;
            }
        }
        System.out.println("Customer with ID " + customerId + " not found.");
        return false; // Return false if customer not found or deletion fails
    }

    public void listCustomer() {
        System.out.println("Listing all customers...");

        for (Customer customer : customer) {
            if (customer != null) {
                System.out.println("Details of customer--->" + customer.getCustomerId() + "--->" + customer.getCustomerName() + "--->" + customer.getCustomerAddress());
            }
        }

    }
}

//
//
//package com.flipkart.business;
//
//import com.flipkart.bean.Customer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CustomerBusiness implements CustomerInterface {
//
//    private List<Customer> customers = new ArrayList<>();
//
//
//    public void createCustomer() {
//        System.out.println("Creating new customers...");
//
//        // Add customers to the list
//        customers.add(new Customer(101, "John Doe", "Address 1"));
//        customers.add(new Customer(102, "Jane Smith", "Address 2"));
//        customers.add(new Customer(103, "Bob Johnson", "Address 3"));
//    }
//
//
//    public boolean updateCustomer(int customerId, String name, String address) {
//        for (Customer customer : customers) {
//            if (customer.getCustomerId() == customerId) {
//                System.out.println("Updating customer with ID: " + customerId);
//                // Perform update logic if needed
//                customer.setCustomerName(name);
//                customer.setCustomerAddress(address);
//                return true;
//            }
//        }
//        System.out.println("Customer with ID " + customerId + " not found.");
//        return false;
//    }
//
//
//    public boolean deleteCustomer(int customerId) {
//        for (Customer customer : customers) {
//            if (customer.getCustomerId() == customerId) {
//                System.out.println("Deleting customer with ID: " + customerId);
//                customers.remove(customer);
//                return true; // Return true if deletion successful
//            }
//        }
//        System.out.println("Customer with ID " + customerId + " not found.");
//        return false; // Return false if customer not found
//    }
//
//    public void listCustomer() {
//        System.out.println("Listing all customers...");
//
//        for (Customer customer : customers) {
//            if (customer != null) {
//                System.out.println("Details of customer--->" + customer.getCustomerId() + "--->" + customer.getCustomerName() + "--->" + customer.getCustomerAddress());
//            }
//        }
//        }
//
//}
//
