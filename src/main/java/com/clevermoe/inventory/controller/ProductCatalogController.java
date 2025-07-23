package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.ProductCatalog;
import com.clevermoe.inventory.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/productcatalog")
@Tag(name = "ProductCatalog", description = "API for ProductCatalog")
public class ProductCatalogController {

    @Autowired
    private ProductCatalogService service;

    @GetMapping
    @Operation(summary = "Get all ProductCatalog entries")
    public List<ProductCatalog> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new ProductCatalog entry")
    public ProductCatalog create(@RequestBody ProductCatalog obj) {
        return service.create(obj);
    }
}
