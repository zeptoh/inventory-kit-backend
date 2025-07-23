package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.OrderManagement;
import com.clevermoe.inventory.service.OrderManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/ordermanagement")
@Tag(name = "OrderManagement", description = "API for OrderManagement")
public class OrderManagementController {

    @Autowired
    private OrderManagementService service;

    @GetMapping
    @Operation(summary = "Get all OrderManagement entries")
    public List<OrderManagement> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new OrderManagement entry")
    public OrderManagement create(@RequestBody OrderManagement obj) {
        return service.create(obj);
    }
}
