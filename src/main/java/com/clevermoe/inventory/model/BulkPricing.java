
package com.clevermoe.inventory.model;

import java.math.BigDecimal;

public class BulkPricing {
    private int minQuantity;
    private BigDecimal discountedPrice;

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
