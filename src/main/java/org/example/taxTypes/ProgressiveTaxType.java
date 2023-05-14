package org.example.taxTypes;

public class ProgressiveTaxType extends TaxType {
    public ProgressiveTaxType() {
    }

    public double calculateTaxFor(double amount) {
        return amount < 100000.0 ? amount * 10.0 / 100.0 : amount * 15.0 / 100.0;
    }
}
