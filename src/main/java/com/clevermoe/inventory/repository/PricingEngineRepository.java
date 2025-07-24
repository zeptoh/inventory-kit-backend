package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.PricingEngine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingEngineRepository extends MongoRepository<PricingEngine, String> {
    PricingEngine findByProductId(String productId);
}
