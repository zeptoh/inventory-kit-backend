package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.InventoryManagement;
import com.clevermoe.inventory.model.PricingEngine;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryManagementRepository extends MongoRepository<InventoryManagement, String> {
    InventoryManagement findByProductId(String productId);
}
