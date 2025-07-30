package com.clevermoe.inventory.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductRelation")
public class ProductRelation {
    private String id;
    private String productId;
    private List<RelatedProduct> relatedProducts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<RelatedProduct> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

}
