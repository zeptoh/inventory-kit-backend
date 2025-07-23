package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.Customer;
import com.clevermoe.inventory.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/customerprofile")
@Tag(name = "CustomerProfile", description = "API for CustomerProfile")
public class CustomerProfileController {

    @Autowired
    private CustomerProfileService service;

    @GetMapping
    @Operation(summary = "Get all CustomerProfile entries")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new CustomerProfile entry")
    public Customer create(@RequestBody Customer obj) {
        return service.create(obj);
    }
}
