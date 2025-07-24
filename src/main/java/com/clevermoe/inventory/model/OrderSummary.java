package com.clevermoe.inventory.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderSummary")
public class OrderSummary {
    @Id
    private String id;
    private ProductCatalog productCatalog;
    private PricingEngine pricingEngine;
    private InventoryManagement inventoryManagement;
    private TaxCalculation taxCalculation;
    private TariffCustoms tariffCustoms;
    private Customer customer;
    private ShippingOption shippingOption;
    private Quotation quotation;
    private LocalDateTime orderDate;
    private String orderStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public PricingEngine getPricingEngine() {
        return pricingEngine;
    }

    public void setPricingEngine(PricingEngine pricingEngine) {
        this.pricingEngine = pricingEngine;
    }

    public InventoryManagement getInventoryManagement() {
        return inventoryManagement;
    }

    public void setInventoryManagement(InventoryManagement inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public TaxCalculation getTaxCalculation() {
        return taxCalculation;
    }

    public void setTaxCalculation(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public TariffCustoms getTarrifCustoms() {
        return tariffCustoms;
    }

    public void setTarrifCustoms(TariffCustoms tariffCustoms) {
        this.tariffCustoms = tariffCustoms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingOption getShippingOption() {
        return shippingOption;
    }

    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption;
    }

    public Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}
