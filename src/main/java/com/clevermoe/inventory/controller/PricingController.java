package com.clevermoe.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pricing")
public class PricingController {

    @PostMapping("/calculate")
    public String calculatePrice() {
        return "Price calculated";
    }
}