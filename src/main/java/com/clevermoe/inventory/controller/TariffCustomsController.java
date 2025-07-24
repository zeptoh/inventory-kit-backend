package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.TariffCustoms;
import com.clevermoe.inventory.model.TaxCalculation;
import com.clevermoe.inventory.service.TariffCustomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/tariffcustoms")
@Tag(name = "TariffCustoms", description = "API for TariffCustoms")
public class TariffCustomsController {

    @Autowired
    private TariffCustomsService service;

    @GetMapping("/all")
    @Operation(summary = "Get all TariffCustoms entries")
    public List<TariffCustoms> getAll() {
        return service.getAll();
    }

    @PostMapping("/product")
    @Operation(summary = "Find a PricingEngine entry for a defined product")
    public TariffCustoms findById(@RequestBody TariffCustoms obj) {
        TariffCustoms tc = service.findByProductId(obj.getProductId());
        if (tc != null) {
            return tc;
        } else
            return obj;
    }

    @PostMapping("/crete")
    @Operation(summary = "Create a new TariffCustoms entry")
    public TariffCustoms create(@RequestBody TariffCustoms obj) {
        return service.create(obj);
    }
}
