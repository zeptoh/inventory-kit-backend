package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProfileRepository extends MongoRepository<Customer, String> {
}
