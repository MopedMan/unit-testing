package com.csc205;

import java.util.Arrays;
import java.lang.Integer;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int... b) {
        return a + Arrays.stream(b).sum();
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}