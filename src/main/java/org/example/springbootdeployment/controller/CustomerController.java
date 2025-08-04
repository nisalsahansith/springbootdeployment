package org.example.springbootdeployment.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeployment.entity.Customer;
import org.example.springbootdeployment.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(
                customerService.createCustomer(customer)
        );
    }
}
