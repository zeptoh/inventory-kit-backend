package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.ShippingOption;
import com.clevermoe.inventory.service.ShippingOptionService;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/shippingoption")
@Tag(name = "ShippingOption", description = "API for ShippingOption")
public class ShippingOptionController {

    @Autowired
    private ShippingOptionService service;

    @GetMapping
    @Operation(summary = "Get all ShippingOption entries")
    public List<ShippingOption> getAll() {
        return service.getAll();
    }

    @PostMapping("/find")
    @Operation(summary = "Find a ShippingOption entry")
    public List<ShippingOption> findByZone(@RequestBody JsonNode obj) {
        Boolean isLoyal = obj.get("isLoyal").asBoolean();
        String addressZone = obj.get("zone").textValue();
        String name = (isLoyal) ? "Overnight" : "Express";

        return service.findByNameAndAddressZone(name, addressZone);
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new ShippingOption entry")
    public ShippingOption create(@RequestBody ShippingOption obj) {
        return service.create(obj);
    }
}
