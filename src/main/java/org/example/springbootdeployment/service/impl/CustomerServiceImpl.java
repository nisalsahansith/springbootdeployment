package org.example.springbootdeployment.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeployment.entity.Customer;
import org.example.springbootdeployment.repo.CustomerRepository;
import org.example.springbootdeployment.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
