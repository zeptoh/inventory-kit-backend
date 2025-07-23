package com.clevermoe.inventory.service;

import org.springframework.stereotype.Service;

@Service
public class RecommendationService {
    public String getRecommendations(String customerId) {
        return "Recommendations for customer: " + customerId;
    }
}