package com.debug.ex08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PercentageCalculatorTest {

    @Test
    @DisplayName("Verify valid percentages are accepted")
    void testValidPercentages() {
        assertDoesNotThrow(() -> PercentageCalculator.setPercentage(0));
        assertDoesNotThrow(() -> PercentageCalculator.setPercentage(50));
        assertDoesNotThrow(() -> PercentageCalculator.setPercentage(100));
    }

    @Test
    @DisplayName("Verify invalid percentages throw IllegalArgumentException")
    void testInvalidPercentages() {
        assertThrows(IllegalArgumentException.class, () -> PercentageCalculator.setPercentage(-1));
        assertThrows(IllegalArgumentException.class, () -> PercentageCalculator.setPercentage(101));
    }

    @Test
    @DisplayName("Verify App handles or passes valid percentage without crashing")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should provide a valid percentage or handle the exception without crashing");
    }
}
