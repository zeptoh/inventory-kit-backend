package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private String id;
    private String name;
    private String sku;
    private String category;
    private double price;
}

    
        
    

        
    

    
        
    