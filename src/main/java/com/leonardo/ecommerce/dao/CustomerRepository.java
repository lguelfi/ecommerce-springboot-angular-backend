package com.leonardo.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.ecommerce.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    Customer findByEmail(String theEmail);
}
