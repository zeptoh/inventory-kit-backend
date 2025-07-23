package com.clevermoe.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document(collection = "tariffcustoms")
public class TariffCustoms {

    @Id
    private String id;

    private String name;

    // Product details
    private String productCode;
    private String productCategory;

    // Origin and destination
    private String originCountry;
    private String destinationCountry;

    // Tariff and customs duty rates
    private BigDecimal importDutyRate;
    private BigDecimal exportDutyRate;
    private BigDecimal customsHandlingFee;

    // Calculated amounts
    private BigDecimal importDutyAmount;
    private BigDecimal exportDutyAmount;
    private BigDecimal totalTariff;

    // Currency
    private String currency;

    // Applicable trade agreement or exemption
    private String tradeAgreementCode;

    // Calculation timestamp
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public BigDecimal getImportDutyRate() {
        return importDutyRate;
    }

    public void setImportDutyRate(BigDecimal importDutyRate) {
        this.importDutyRate = importDutyRate;
    }

    public BigDecimal getExportDutyRate() {
        return exportDutyRate;
    }

    public void setExportDutyRate(BigDecimal exportDutyRate) {
        this.exportDutyRate = exportDutyRate;
    }

    public BigDecimal getCustomsHandlingFee() {
        return customsHandlingFee;
    }

    public void setCustomsHandlingFee(BigDecimal customsHandlingFee) {
        this.customsHandlingFee = customsHandlingFee;
    }

    public BigDecimal getImportDutyAmount() {
        return importDutyAmount;
    }

    public void setImportDutyAmount(BigDecimal importDutyAmount) {
        this.importDutyAmount = importDutyAmount;
    }

    public BigDecimal getExportDutyAmount() {
        return exportDutyAmount;
    }

    public void setExportDutyAmount(BigDecimal exportDutyAmount) {
        this.exportDutyAmount = exportDutyAmount;
    }

    public BigDecimal getTotalTariff() {
        return totalTariff;
    }

    public void setTotalTariff(BigDecimal totalTariff) {
        this.totalTariff = totalTariff;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTradeAgreementCode() {
        return tradeAgreementCode;
    }

    public void setTradeAgreementCode(String tradeAgreementCode) {
        this.tradeAgreementCode = tradeAgreementCode;
    }

    public String getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(String calculationDate) {
        this.calculationDate = calculationDate;
    }

}
