package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.ShippingOption;
import com.clevermoe.inventory.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository repository;

    public List<ShippingOption> getAll() {
        return repository.findAll();
    }

    public ShippingOption create(ShippingOption obj) {
        return repository.save(obj);
    }
}
