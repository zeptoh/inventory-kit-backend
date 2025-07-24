package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.OrderSummary;
import com.clevermoe.inventory.repository.OrderSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderSummaryService {

    @Autowired
    private OrderSummaryRepository repository;

    public List<OrderSummary> getAll() {
        return repository.findAll();
    }

    public OrderSummary create(OrderSummary obj) {
        return repository.save(obj);
    }
}
