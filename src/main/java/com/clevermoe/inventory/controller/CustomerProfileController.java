package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.Customer;
import com.clevermoe.inventory.service.CustomerProfileService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customerprofile")
@Tag(name = "CustomerProfile", description = "API for CustomerProfile")
public class CustomerProfileController {

    @Autowired
    private CustomerProfileService service;

    @GetMapping("/all")
    @Operation(summary = "Get all CustomerProfile entries")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping("/find")
    @Operation(summary = "Get specific CustomerProfile entry")
    public Customer findById(@RequestBody JsonNode requestBody) throws JsonProcessingException {
        String cusId = requestBody.get("email").textValue();
        return service.findByEmail(cusId);
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new CustomerProfile entry")
    public Customer create(@RequestBody Customer obj) {
        return service.create(obj);
    }
}
