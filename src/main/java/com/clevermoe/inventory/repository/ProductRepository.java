package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}