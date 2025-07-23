package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.TaxCalculation;
import com.clevermoe.inventory.repository.TaxCalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaxCalculationService {

    @Autowired
    private TaxCalculationRepository repository;

    public List<TaxCalculation> getAll() {
        return repository.findAll();
    }

    public TaxCalculation create(TaxCalculation obj) {
        return repository.save(obj);
    }
}
