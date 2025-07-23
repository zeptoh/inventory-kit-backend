package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "inventorymanagement")
public class InventoryManagement {

    @Id
    private String id;

    private String name;

    // Product SKU or code
    private String productCode;

    // Total stock available across all warehouses
    private int totalStock;

    // List of stock details per warehouse
    private List<WarehouseStock> warehouseStocks;

    // Estimated delivery time in days
    private int estimatedDeliveryDays;

    // Reorder threshold
    private int reorderLevel;

    // Supplier info
    private String supplierName;

    // Last restock date
    private String lastRestockDate;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public List<WarehouseStock> getWarehouseStocks() {
        return warehouseStocks;
    }

    public void setWarehouseStocks(List<WarehouseStock> warehouseStocks) {
        this.warehouseStocks = warehouseStocks;
    }

    public int getEstimatedDeliveryDays() {
        return estimatedDeliveryDays;
    }

    public void setEstimatedDeliveryDays(int estimatedDeliveryDays) {
        this.estimatedDeliveryDays = estimatedDeliveryDays;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getLastRestockDate() {
        return lastRestockDate;
    }

    public void setLastRestockDate(String lastRestockDate) {
        this.lastRestockDate = lastRestockDate;
    }

}
