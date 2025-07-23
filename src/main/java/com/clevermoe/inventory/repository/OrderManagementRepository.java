package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.OrderManagement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderManagementRepository extends MongoRepository<OrderManagement, String> {
}
