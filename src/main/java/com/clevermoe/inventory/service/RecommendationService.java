package com.clevermoe.inventory.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clevermoe.inventory.model.*;

import com.clevermoe.inventory.repository.PurchaseHistoryRepository;

@Service
public class RecommendationService {

    @Autowired
    private PurchaseHistoryRepository purchaseRepo;

    @Autowired
    private ProductRelationRepository relationRepo;

    public List<Recommendation> generateRecommendations(String customerId, List<String> currentCart) {
        PurchaseHistory history = purchaseRepo.findByCustomerId(customerId).orElse(new PurchaseHistory());
        Map<String, Double> recommended = new HashMap<>();

        for (String item : currentCart) {
            ProductRelation relation = relationRepo.findByProductId(item).orElse(null);
            if (relation != null) {
                for (RelatedProduct related : relation.getRelatedProducts()) {
                    if (!currentCart.contains(related.getRelatedProductId())) {
                        recommended.merge(related.getRelatedProductId(), related.getScore(), Math::max);
                    }
                }
            }
        }

        return recommended.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .map(e -> new Recommendation(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }
}
