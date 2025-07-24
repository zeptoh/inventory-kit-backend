package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.OrderSummary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSummaryRepository extends MongoRepository<OrderSummary, String> {
}
