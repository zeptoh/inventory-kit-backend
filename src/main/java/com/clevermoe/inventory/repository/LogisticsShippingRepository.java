package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.LogisticsShipping;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticsShippingRepository extends MongoRepository<LogisticsShipping, String> {
}
