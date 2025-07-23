package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.Customer;
import com.clevermoe.inventory.repository.CustomerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerProfileService {

    @Autowired
    private CustomerProfileRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer create(Customer obj) {
        return repository.save(obj);
    }
}