package com.clevermoe.inventory.service;

import com.clevermoe.inventory.model.ProductCatalog;
import com.clevermoe.inventory.repository.ProductCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductCatalogService {

    @Autowired
    private ProductCatalogRepository repository;

    public List<ProductCatalog> getAll() {
        return repository.findAll();
    }

    public ProductCatalog findByProductId(String id) {
        return repository.findByProductId(id);
    }

    public ProductCatalog create(ProductCatalog obj) {
        return repository.save(obj);
    }
}
