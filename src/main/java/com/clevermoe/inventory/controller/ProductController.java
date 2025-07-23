package com.clevermoe.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getAllProducts() {
        return "List of all products";
    }

    @PostMapping
    public String addProduct() {
        return "Product added";
    }
}