package com.clevermoe.inventory.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String getAllProducts() {
        return "List of all products";
    }

    public String addProduct() {
        return "Product added";
    }
}