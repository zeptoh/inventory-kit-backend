package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.LogisticsShipping;
import com.clevermoe.inventory.repository.LogisticsShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LogisticsShippingService {

    @Autowired
    private LogisticsShippingRepository repository;

    public List<LogisticsShipping> getAll() {
        return repository.findAll();
    }

    public LogisticsShipping create(LogisticsShipping obj) {
        return repository.save(obj);
    }
}
