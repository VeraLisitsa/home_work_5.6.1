package org.example;

import org.example.taxTypes.TaxType;


public class Bill {
    protected double amount;
    protected TaxType taxType;
    protected TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public double payTaxes() {
        double taxToPay = this.taxType.calculateTaxFor(this.amount);
        return taxToPay;
    }
}