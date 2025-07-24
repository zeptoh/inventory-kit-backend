package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.TaxCalculation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxCalculationRepository extends MongoRepository<TaxCalculation, String> {
    TaxCalculation findByProductId(String productId);
}
