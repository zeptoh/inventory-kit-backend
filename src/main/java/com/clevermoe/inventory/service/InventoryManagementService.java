package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.InventoryManagement;
import com.clevermoe.inventory.repository.InventoryManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventoryManagementService {

    @Autowired
    private InventoryManagementRepository repository;

    public List<InventoryManagement> getAll() {
        return repository.findAll();
    }

    public InventoryManagement create(InventoryManagement obj) {
        return repository.save(obj);
    }
}
