package com.clevermoe.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.clevermoe.inventory.service.RecommendationService;
import com.clevermoe.inventory.model.*;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @PostMapping
    public ResponseEntity<List<Recommendation>> getRecommendations(
            @RequestBody RecommendationRequest request) {
        List<Recommendation> recommendations = recommendationService.generateRecommendations(
                request.getCustomerId(), request.getCurrentCart());
        return ResponseEntity.ok(recommendations);
    }
}
