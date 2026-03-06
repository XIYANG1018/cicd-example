package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void isEven_shouldReturnTrueForEvenNumbers() {
        assertTrue(Calculator.isEven(8));
    }
}
