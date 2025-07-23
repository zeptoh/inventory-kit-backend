package com.clevermoe.inventory.controller;

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

    @GetMapping
    @Operation(summary = "Get all TaxCalculation entries")
    public List<TaxCalculation> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new TaxCalculation entry")
    public TaxCalculation create(@RequestBody TaxCalculation obj) {
        return service.create(obj);
    }
}
