package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.PricingEngine;
import com.clevermoe.inventory.repository.PricingEngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PricingEngineService {

    @Autowired
    private PricingEngineRepository repository;

    public List<PricingEngine> getAll() {
        return repository.findAll();
    }

    public PricingEngine create(PricingEngine obj) {
        return repository.save(obj);
    }
}
