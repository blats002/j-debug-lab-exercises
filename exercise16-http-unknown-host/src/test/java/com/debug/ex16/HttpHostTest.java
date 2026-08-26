package com.debug.ex16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HttpHostTest {

    @Test
    @DisplayName("Verify HTTP client connects to a valid resolvable host without UnknownHostException")
    void testHostResolution() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should connect to a valid hostname without throwing UnknownHostException");
    }
}
