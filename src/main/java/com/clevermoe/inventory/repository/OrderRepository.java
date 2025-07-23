package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}