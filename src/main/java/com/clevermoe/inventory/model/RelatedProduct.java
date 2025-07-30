package com.clevermoe.inventory.model;

public class RelatedProduct {
    private String relatedProductId;
    private String relationType; // e.g., BOUGHT_TOGETHER, ACCESSORY_OF
    private double score;

    public String getRelatedProductId() {
        return relatedProductId;
    }

    public void setRelatedProductId(String relatedProductId) {
        this.relatedProductId = relatedProductId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
