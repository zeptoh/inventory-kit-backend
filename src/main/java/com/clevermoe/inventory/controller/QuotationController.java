package com.clevermoe.inventory.controller;

import com.clevermoe.inventory.model.OrderItem;
import com.clevermoe.inventory.model.Quotation;
import com.clevermoe.inventory.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/api/quotation")
@Tag(name = "Quotation", description = "API for Quotation")
public class QuotationController {

    @Autowired
    private QuotationService service;

    @GetMapping
    @Operation(summary = "Get all Quotation entries")
    public List<Quotation> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Operation(summary = "Create a new Quotation entry")
    public Quotation create(@RequestBody Quotation obj) {
        LocalDateTime now = LocalDateTime.now();
        obj.setValidFrom(now);
        obj.setValidTo(now.plusDays(obj.getEstimatedDeliveryDays()));

        // Calculate Total Amount
        double totalAmount = 0;
        List<OrderItem> items = obj.getItems();
        ListIterator<OrderItem> itemsIterator = items.listIterator();
        while (itemsIterator.hasNext()) {
            OrderItem item = itemsIterator.next();
            double itemAmount = item.getUnitprice() * item.getQuantity() + item.getTaxAmount() + item.getDutyRate()
                    - item.getDiscountAmount() + obj.getDeliveryCharge();
            totalAmount += itemAmount;
        }
        obj.setTotalAmount(totalAmount);

        return service.create(obj);
    }
}
