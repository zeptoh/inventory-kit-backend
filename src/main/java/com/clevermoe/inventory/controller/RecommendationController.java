package com.clevermoe.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    @GetMapping("/{customerId}")
    public String getRecommendations(@PathVariable String customerId) {
        return "Recommendations for customer: " + customerId;
    }
}
