package org.example.springbootdeployment.service;

import org.example.springbootdeployment.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomer();
    Customer createCustomer(Customer customer);
}
