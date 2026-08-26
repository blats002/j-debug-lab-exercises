package com.debug.ex05;

public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            System.err.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}