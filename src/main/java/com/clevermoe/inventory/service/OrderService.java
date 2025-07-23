package com.clevermoe.inventory.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String getAllOrders() {
        return "List of all orders";
    }

    public String placeOrder() {
        return "Order placed";
    }
}