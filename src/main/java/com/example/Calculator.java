package com.example;

/**
 * Small demo class used by the example pipelines.
 */
public final class Calculator {

    private Calculator() {
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
