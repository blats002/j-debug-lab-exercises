package com.debug.ex18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemoryLeakTest {

    @Test
    @DisplayName("Verify memory allocation loop is bounded or cleared without OutOfMemoryError")
    void testMemorySafety() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should bound memory allocations or clear accumulated data without throwing OutOfMemoryError");
    }
}
