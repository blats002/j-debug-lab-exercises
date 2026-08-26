package com.debug.ex05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Verify normal division works correctly")
    void testNormalDivision() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2), "10 / 2 should equal 5");
    }

    @Test
    @DisplayName("Verify App handles divide by zero without crashing on ArithmeticException")
    void testDivideByZeroHandling() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should guard against divide-by-zero without throwing unhandled ArithmeticException");
    }
}
