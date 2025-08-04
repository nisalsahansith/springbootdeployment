package org.example.springbootdeployment.repo;

import org.example.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Additional query methods can be defined here if needed
}
