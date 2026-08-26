package com.debug.ex15;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonParseTest {

    @Test
    @DisplayName("Verify JSON file parses into User object without JsonProcessingException")
    void testJsonParsing() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should parse valid JSON into a User object without throwing JsonProcessingException");
    }
}
