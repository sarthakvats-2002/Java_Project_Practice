package com.flipkart.business;

public interface CustomerInterface {
    public void createCustomer();

    public boolean updateCustomer(int customerId, String customerName, String customerAddress);

    public boolean deleteCustomer(int customerId);

    public void listCustomer();
}
