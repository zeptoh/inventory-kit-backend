package com.clevermoe.inventory.model;

import java.util.List;

public class RecommendationRequest {
    private String customerId;
    private List<String> currentCart;

    public RecommendationRequest() {
    }

    public RecommendationRequest(String customerId, List<String> currentCart) {
        this.customerId = customerId;
        this.currentCart = currentCart;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<String> getCurrentCart() {
        return currentCart;
    }

    public void setCurrentCart(List<String> currentCart) {
        this.currentCart = currentCart;
    }
}
