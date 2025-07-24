package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.Customer;
import com.clevermoe.inventory.model.ShippingOption;
import com.clevermoe.inventory.repository.ShippingOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingOptionService {

    @Autowired
    private ShippingOptionRepository repository;

    public List<ShippingOption> getAll() {
        return repository.findAll();
    }

    public List<ShippingOption> findByNameAndAddressZone(String name, String addressZone) {
        return repository.findByNameAndAddressZone(name, addressZone);
    }

    public ShippingOption findById(String id) {
        return repository.findById(id).orElseGet(() -> null);
    }

    public ShippingOption create(ShippingOption obj) {
        return repository.save(obj);
    }
}
