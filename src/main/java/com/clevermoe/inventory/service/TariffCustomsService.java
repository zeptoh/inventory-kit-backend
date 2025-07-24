package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.TariffCustoms;
import com.clevermoe.inventory.model.TaxCalculation;
import com.clevermoe.inventory.repository.TariffCustomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TariffCustomsService {

    @Autowired
    private TariffCustomsRepository repository;

    public List<TariffCustoms> getAll() {
        return repository.findAll();
    }

    public TariffCustoms findByProductId(String id) {
        return repository.findByProductId(id);
    }

    public TariffCustoms create(TariffCustoms obj) {
        return repository.save(obj);
    }
}
