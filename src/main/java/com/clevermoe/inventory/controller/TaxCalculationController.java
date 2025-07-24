package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.PricingEngine;
import com.clevermoe.inventory.model.TaxCalculation;
import com.clevermoe.inventory.service.TaxCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/taxcalculation")
@Tag(name = "TaxCalculation", description = "API for TaxCalculation")
public class TaxCalculationController {

    @Autowired
    private TaxCalculationService service;

    @GetMapping("/all")
    @Operation(summary = "Get all TaxCalculation entries")
    public List<TaxCalculation> getAll() {
        return service.getAll();
    }

    @PostMapping("/product")
    @Operation(summary = "Find a PricingEngine entry for a defined product")
    public TaxCalculation findById(@RequestBody TaxCalculation obj) {
        TaxCalculation tc = service.findByProductId(obj.getProductId());
        if (tc != null) {
            return tc;
        } else
            return obj;
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new TaxCalculation entry")
    public TaxCalculation create(@RequestBody TaxCalculation obj) {
        return service.create(obj);
    }
}
