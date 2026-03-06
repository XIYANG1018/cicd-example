package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Intentionally failing test. This file is excluded from the normal success path
 * and only used by the failing pipeline after being copied into place.
 */
class CalculatorFailingTest {

    @Test
    void failingExample() {
        assertEquals(999, Calculator.add(2, 3));
    }
}
