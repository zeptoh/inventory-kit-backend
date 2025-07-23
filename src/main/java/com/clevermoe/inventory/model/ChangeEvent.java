package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChangeEvent {
    @Id
    private String id;
    private String eventType;
    private String description;
}