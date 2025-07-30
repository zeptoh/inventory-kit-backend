package com.clevermoe.inventory.service;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.clevermoe.inventory.model.ProductRelation;;;

@Repository
public interface ProductRelationRepository extends MongoRepository<ProductRelation, String> {
    Optional<ProductRelation> findByProductId(String productId);
}
