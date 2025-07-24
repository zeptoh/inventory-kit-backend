package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.ProductCatalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCatalogRepository extends MongoRepository<ProductCatalog, String> {
    ProductCatalog findByCode(String code);
}
