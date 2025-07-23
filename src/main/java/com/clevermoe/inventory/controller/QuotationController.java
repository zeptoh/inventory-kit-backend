package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.Quotation;
import com.clevermoe.inventory.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/quotation")
@Tag(name = "Quotation", description = "API for Quotation")
public class QuotationController {

    @Autowired
    private QuotationService service;

    @GetMapping
    @Operation(summary = "Get all Quotation entries")
    public List<Quotation> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new Quotation entry")
    public Quotation create(@RequestBody Quotation obj) {
        return service.create(obj);
    }
}
