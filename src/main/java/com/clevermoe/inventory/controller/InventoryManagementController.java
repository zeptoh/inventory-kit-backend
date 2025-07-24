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

    @GetMapping("all")
    @Operation(summary = "Get all InventoryManagement entries")
    public List<InventoryManagement> getAll() {
        return service.getAll();
    }

    @PostMapping("product")
    @Operation(summary = "Find a InventoryManagement entry for a specified product ")
    public InventoryManagement findByProductId(@RequestBody InventoryManagement obj) {
        InventoryManagement im = service.findByProductId(obj.getProductId());
        if (im != null) {
            return im;
        } else {
            return obj;
        }
    }

    @PostMapping("create")
    @Operation(summary = "Create a new InventoryManagement entry")
    public InventoryManagement create(@RequestBody InventoryManagement obj) {
        return service.create(obj);
    }
}
