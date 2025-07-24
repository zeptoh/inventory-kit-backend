package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.OrderManagement;
import com.clevermoe.inventory.model.OrderSummary;
import com.clevermoe.inventory.service.CustomerProfileService;
import com.clevermoe.inventory.service.InventoryManagementService;
import com.clevermoe.inventory.service.OrderManagementService;
import com.clevermoe.inventory.service.OrderSummaryService;
import com.clevermoe.inventory.service.PricingEngineService;
import com.clevermoe.inventory.service.ProductCatalogService;
import com.clevermoe.inventory.service.QuotationService;
import com.clevermoe.inventory.service.ShippingOptionService;
import com.clevermoe.inventory.service.TariffCustomsService;
import com.clevermoe.inventory.service.TaxCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/api/ordermanagement")
@Tag(name = "OrderManagement", description = "API for OrderManagement")
public class OrderManagementController {

    @Autowired
    private OrderManagementService service;

    @Autowired
    private OrderSummaryService summaryService;

    @Autowired
    private ProductCatalogService productCatalogService;

    @Autowired
    private PricingEngineService pricingEngineService;

    @Autowired
    private CustomerProfileService customerProfileService;

    @Autowired
    private InventoryManagementService inventoryManagementService;

    @Autowired
    private TaxCalculationService taxCalculationService;

    @Autowired
    private TariffCustomsService tariffCustomsService;

    @Autowired
    private ShippingOptionService shippingOptionService;

    @Autowired
    private QuotationService quotationService;

    @GetMapping
    @Operation(summary = "Get all OrderManagement entries")
    public List<OrderManagement> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new OrderManagement entry")
    public OrderSummary create(@RequestBody OrderManagement obj) {
        OrderManagement om = service.create(obj);
        OrderSummary os = new OrderSummary();
        os.setProductCatalog(productCatalogService.findByProductId(obj.getProductId()));
        os.setPricingEngine(pricingEngineService.findByProductId(obj.getProductId()));
        os.setInventoryManagement(inventoryManagementService.findByProductId(obj.getProductId()));
        os.setTaxCalculation(taxCalculationService.findByProductId(obj.getProductId()));
        os.setTarrifCustoms(tariffCustomsService.findByProductId(obj.getProductId()));
        os.setCustomer(customerProfileService.findById(obj.getCustomerId()));
        os.setShippingOption(shippingOptionService.findById(obj.getShippingId()));
        os.setQuotation(quotationService.findById(obj.getQuotationId()));
        os.setOrderDate(om.getOrderDate());
        os.setOrderStatus(om.getOrderStatus());

        return summaryService.create(os);
    }
}
