package org.example.taxTypes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class IncomeTaxTypeTests {
    IncomeTaxType incomeTaxType;

    @BeforeEach
    public void beforeEach() {
        incomeTaxType = new IncomeTaxType();
    }

    @AfterEach
    public void afterEach() {
        incomeTaxType = null;
    }

    @Test
    public void testCalculateTaxFor() {
        double amount = 100.0, expected = 13.0;

        double result = incomeTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testExceptionCalculateTaxFor() {
        double amount = -400000;
        Class<RuntimeException> expected = RuntimeException.class;

        Assertions.assertThrows(expected, () -> incomeTaxType.calculateTaxFor(amount));

    }

}
