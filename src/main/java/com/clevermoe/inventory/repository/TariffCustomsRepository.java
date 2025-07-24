package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.TariffCustoms;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffCustomsRepository extends MongoRepository<TariffCustoms, String> {
    TariffCustoms findByProductId(String productId);
}
