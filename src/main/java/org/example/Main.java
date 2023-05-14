package org.example;

import org.example.taxTypes.IncomeTaxType;
import org.example.taxTypes.ProgressiveTaxType;
import org.example.taxTypes.VATaxType;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{new Bill(101.98, new IncomeTaxType(), taxService),
                new Bill(1025.0, new VATaxType(), taxService),
                new Bill(5358.0, new ProgressiveTaxType(), taxService),
                new Bill(5002409.0, new ProgressiveTaxType(), taxService)};

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            taxService.payOut(bill.payTaxes());
        }

    }
}