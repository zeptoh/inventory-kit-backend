package com.clevermoe.inventory.model;

public class ShippingOption {
    private String id;
    private String name;

    // Carrier details
    private String carrierName;

    // Shipping method type (e.g., Standard, Express, Overnight)
    private String methodType;

    // Estimated delivery time in days
    private int estimatedDeliveryDays;

    // Shipping cost
    private double cost;

    // Weight limit for this option
    private double maxWeight;

    // Region or zone this option applies to
    private String applicableRegion;

    // Tracking support
    private boolean trackingAvailable;

    // Insurance included
    private boolean insuranceIncluded;

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

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public int getEstimatedDeliveryDays() {
        return estimatedDeliveryDays;
    }

    public void setEstimatedDeliveryDays(int estimatedDeliveryDays) {
        this.estimatedDeliveryDays = estimatedDeliveryDays;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getApplicableRegion() {
        return applicableRegion;
    }

    public void setApplicableRegion(String applicableRegion) {
        this.applicableRegion = applicableRegion;
    }

    public boolean isTrackingAvailable() {
        return trackingAvailable;
    }

    public void setTrackingAvailable(boolean trackingAvailable) {
        this.trackingAvailable = trackingAvailable;
    }

    public boolean isInsuranceIncluded() {
        return insuranceIncluded;
    }

    public void setInsuranceIncluded(boolean insuranceIncluded) {
        this.insuranceIncluded = insuranceIncluded;
    }
}