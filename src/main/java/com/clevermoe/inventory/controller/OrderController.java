package com.clevermoe.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getAllOrders() {
        return "List of all orders";
    }

    @PostMapping
    public String placeOrder() {
        return "Order placed";
    }
}
