package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.PricingEngine;
import com.clevermoe.inventory.service.PricingEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pricingengine")
@Tag(name = "PricingEngine", description = "API for PricingEngine")
public class PricingEngineController {

    @Autowired
    private PricingEngineService service;

    @GetMapping("/all")
    @Operation(summary = "Get all PricingEngine entries")
    public List<PricingEngine> getAll() {
        return service.getAll();
    }

    @PostMapping("/product")
    @Operation(summary = "Find a PricingEngine entry for a defined product")
    public PricingEngine findById(@RequestBody PricingEngine obj) {
        PricingEngine pe = service.findByProductId(obj.getProductId());

        if (pe != null) {
            return pe;
        } else
            return obj;
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new PricingEngine entry")
    public PricingEngine create(@RequestBody PricingEngine obj) {
        return service.create(obj);
    }
}
