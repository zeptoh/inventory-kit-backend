package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.Quotation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationRepository extends MongoRepository<Quotation, String> {
}
