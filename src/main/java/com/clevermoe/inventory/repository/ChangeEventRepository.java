package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.ChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeEventRepository extends MongoRepository<ChangeEvent, String> {
}