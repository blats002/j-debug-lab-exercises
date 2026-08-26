package com.debug.ex17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadInterruptTest {

    @Test
    @DisplayName("Verify Worker handles thread interruption gracefully without crashing")
    void testThreadInterruption() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should handle thread interruption safely without throwing unexpected exceptions");
    }
}
