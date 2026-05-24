package com.debug.ex08;

public class PercentageCalculator {

    public static void setPercentage(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException(
                "Value not accepted: " + value
            );
        }

        System.out.println("Percentage successfully set to: " + value + "%");
    }
}