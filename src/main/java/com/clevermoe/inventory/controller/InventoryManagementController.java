package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.InventoryManagement;
import com.clevermoe.inventory.service.InventoryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/inventorymanagement")
@Tag(name = "InventoryManagement", description = "API for InventoryManagement")
public class InventoryManagementController {

    @Autowired
    private InventoryManagementService service;

    @GetMapping
    @Operation(summary = "Get all InventoryManagement entries")
    public List<InventoryManagement> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new InventoryManagement entry")
    public InventoryManagement create(@RequestBody InventoryManagement obj) {
        return service.create(obj);
    }
}
