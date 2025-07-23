package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.OrderManagement;
import com.clevermoe.inventory.repository.OrderManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderManagementService {

    @Autowired
    private OrderManagementRepository repository;

    public List<OrderManagement> getAll() {
        return repository.findAll();
    }

    public OrderManagement create(OrderManagement obj) {
        return repository.save(obj);
    }
}
