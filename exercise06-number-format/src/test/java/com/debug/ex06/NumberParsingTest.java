package com.debug.ex06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberParsingTest {

    @Test
    @DisplayName("Verify App handles invalid number strings without throwing NumberFormatException")
    void testNumberParsing() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should validate or safely handle non-numeric input without throwing NumberFormatException");
    }
}
