package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.ShippingOption;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends MongoRepository<ShippingOption, String> {
}
