package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.PricingEngine;
import com.clevermoe.inventory.service.PricingEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/pricingengine")
@Tag(name = "PricingEngine", description = "API for PricingEngine")
public class PricingEngineController {

    @Autowired
    private PricingEngineService service;

    @GetMapping
    @Operation(summary = "Get all PricingEngine entries")
    public List<PricingEngine> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new PricingEngine entry")
    public PricingEngine create(@RequestBody PricingEngine obj) {
        return service.create(obj);
    }
}
