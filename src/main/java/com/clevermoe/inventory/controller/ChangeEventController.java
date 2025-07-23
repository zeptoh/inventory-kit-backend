package com.clevermoe.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/change-events")
public class ChangeEventController {

    @PostMapping
    public String logChangeEvent() {
        return "Change event logged";
    }
}