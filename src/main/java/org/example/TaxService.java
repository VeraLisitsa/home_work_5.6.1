package org.example;

public class TaxService {
    public TaxService() {
    }

    public void payOut(double taxAmount) {
        System.out.printf("Уплачен налог в размере %.2f\n", taxAmount);
    }
}
