package com.clevermoe.inventory.loader;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class SampleDataLoader {
    @PostConstruct
    public void loadData() {
        // Load sample data
    }
}