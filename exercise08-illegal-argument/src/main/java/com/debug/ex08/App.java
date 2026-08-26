package com.debug.ex08;

public class App {
    public static void main(String[] args) {
        int percentage = 50;
        try {
            PercentageCalculator.setPercentage(percentage);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid percentage: " + e.getMessage());
        }
    }
}
