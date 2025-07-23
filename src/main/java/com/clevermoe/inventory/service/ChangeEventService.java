package com.clevermoe.inventory.service;

import org.springframework.stereotype.Service;

@Service
public class ChangeEventService {
    public String logChangeEvent() {
        return "Change event logged";
    }
}