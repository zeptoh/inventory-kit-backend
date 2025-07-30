package com.clevermoe.inventory.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PurchaseHistory")
public class PurchaseHistory {
    @Id
    private String id;
    private String customerId;
    private List<PurchaseRecord> purchases;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<PurchaseRecord> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseRecord> purchases) {
        this.purchases = purchases;
    }

}
