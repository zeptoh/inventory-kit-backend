package com.clevermoe.inventory.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clevermoe.inventory.model.PurchaseHistory;

@Repository
public interface PurchaseHistoryRepository extends MongoRepository<PurchaseHistory, String> {
    Optional<PurchaseHistory> findByCustomerId(String customerId);
}
