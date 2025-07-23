package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.LogisticsShipping;
import com.clevermoe.inventory.service.LogisticsShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/logisticsshipping")
@Tag(name = "LogisticsShipping", description = "API for LogisticsShipping")
public class LogisticsShippingController {

    @Autowired
    private LogisticsShippingService service;

    @GetMapping
    @Operation(summary = "Get all LogisticsShipping entries")
    public List<LogisticsShipping> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new LogisticsShipping entry")
    public LogisticsShipping create(@RequestBody LogisticsShipping obj) {
        return service.create(obj);
    }
}
