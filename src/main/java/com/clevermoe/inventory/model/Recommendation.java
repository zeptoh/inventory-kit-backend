package com.clevermoe.inventory.model;

public class Recommendation {
    private String sku;
    private double confidence;

    public Recommendation(String sku, double confidence) {
        this.sku = sku;
        this.confidence = confidence;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

}
