package com.debug.ex19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @DisplayName("Verify factorial computation has base case and calculates correctly")
    void testFactorialCalculation() {
        assertEquals(1, App.factorial(0), "0! should equal 1");
        assertEquals(1, App.factorial(1), "1! should equal 1");
        assertEquals(120, App.factorial(5), "5! should equal 120");
    }

    @Test
    @DisplayName("Verify App.main executes without StackOverflowError")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should execute factorial calculation without throwing StackOverflowError");
    }
}
