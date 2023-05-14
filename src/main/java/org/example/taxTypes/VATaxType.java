package org.example.taxTypes;

public class VATaxType extends TaxType {
    public VATaxType() {
    }

    public double calculateTaxFor(double amount) {
        return amount * 18.0 / 100.0;
    }
}
