package org.example.taxTypes;

public class IncomeTaxType extends TaxType {
    public IncomeTaxType() {
    }

    public double calculateTaxFor(double amount) {
        if( amount > 0) {
            return amount * 13.0 / 100.0;
        } else {
            throw new RuntimeException("Недопустимое значение");
        }
    }
}