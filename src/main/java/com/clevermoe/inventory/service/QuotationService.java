package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.Quotation;
import com.clevermoe.inventory.model.ShippingOption;
import com.clevermoe.inventory.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuotationService {

    @Autowired
    private QuotationRepository repository;

    public List<Quotation> getAll() {
        return repository.findAll();
    }

    public Quotation findById(String id) {
        return repository.findById(id).orElseGet(() -> null);
    }

    public Quotation create(Quotation obj) {
        return repository.save(obj);
    }
}
