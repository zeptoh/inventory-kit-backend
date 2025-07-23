package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.util.List;

@Document(collection = "pricingengine")
public class PricingEngine {

    @Id
    private String id;

    private String name;

    // Base price of the product
    private BigDecimal basePrice;

    // Discount percentage for MVP customers
    private Double mvpDiscountPercent;

    // Bulk pricing thresholds and prices
    private List<BulkPricing> bulkPricing;

    // Promotional offer details
    private List<PromotionalOffer> promotionalOffers;

    // Currency code (e.g., USD, INR)
    private String currency;

    // Product category or SKU reference
    private String productCode;

    // Effective date range for pricing
    private String validFrom;
    private String validTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Double getMvpDiscountPercent() {
        return mvpDiscountPercent;
    }

    public void setMvpDiscountPercent(Double mvpDiscountPercent) {
        this.mvpDiscountPercent = mvpDiscountPercent;
    }

    public List<BulkPricing> getBulkPricing() {
        return bulkPricing;
    }

    public void setBulkPricing(List<BulkPricing> bulkPricing) {
        this.bulkPricing = bulkPricing;
    }

    public List<PromotionalOffer> getPromotionalOffers() {
        return promotionalOffers;
    }

    public void setPromotionalOffers(List<PromotionalOffer> promotionalOffers) {
        this.promotionalOffers = promotionalOffers;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

}
