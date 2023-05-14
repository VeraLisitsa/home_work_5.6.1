package org.example.taxTypes;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class ProgressiveTaxTypeTests {

    ProgressiveTaxType progressiveTaxType;

    @BeforeEach
    public void beforeEach() {
        progressiveTaxType = new ProgressiveTaxType();
    }

    @AfterEach
    public void afterEach() {
        progressiveTaxType = null;
    }


    @Test
    public void testCalculateTaxFor() {
        double amount = 50000, expected = 5000;

        double result = progressiveTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void parameterizedTestCalculateTaxFor(double amount, double expected) {
        double result = progressiveTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }

    public static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(1000, 100),
                Arguments.of(100000, 15000),
                Arguments.of(200000, 30000));

    }

}
