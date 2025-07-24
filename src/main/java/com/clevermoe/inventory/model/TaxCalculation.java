package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document(collection = "TaxCalculation")
public class TaxCalculation {

    @Id
    private String id;

    private String name;

    // Product or service code
    private String itemCode;

    private String productId;

    // Location details for tax computation
    private String country;
    private String state;
    private String city;

    // Tax rates
    private Double taxRate;
    private BigDecimal localTaxRate;
    private BigDecimal stateTaxRate;
    private BigDecimal federalTaxRate;

    // Computed tax amounts
    private Double taxAmount;
    private BigDecimal localTaxAmount;
    private BigDecimal stateTaxAmount;
    private BigDecimal federalTaxAmount;

    // Total tax
    private BigDecimal totalTax;

    // Currency
    private String currency;

    // Timestamp of calculation
    private String calculationDate;

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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getLocalTaxRate() {
        return localTaxRate;
    }

    public void setLocalTaxRate(BigDecimal localTaxRate) {
        this.localTaxRate = localTaxRate;
    }

    public BigDecimal getStateTaxRate() {
        return stateTaxRate;
    }

    public void setStateTaxRate(BigDecimal stateTaxRate) {
        this.stateTaxRate = stateTaxRate;
    }

    public BigDecimal getFederalTaxRate() {
        return federalTaxRate;
    }

    public void setFederalTaxRate(BigDecimal federalTaxRate) {
        this.federalTaxRate = federalTaxRate;
    }

    public BigDecimal getLocalTaxAmount() {
        return localTaxAmount;
    }

    public void setLocalTaxAmount(BigDecimal localTaxAmount) {
        this.localTaxAmount = localTaxAmount;
    }

    public BigDecimal getStateTaxAmount() {
        return stateTaxAmount;
    }

    public void setStateTaxAmount(BigDecimal stateTaxAmount) {
        this.stateTaxAmount = stateTaxAmount;
    }

    public BigDecimal getFederalTaxAmount() {
        return federalTaxAmount;
    }

    public void setFederalTaxAmount(BigDecimal federalTaxAmount) {
        this.federalTaxAmount = federalTaxAmount;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(String calculationDate) {
        this.calculationDate = calculationDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

}
