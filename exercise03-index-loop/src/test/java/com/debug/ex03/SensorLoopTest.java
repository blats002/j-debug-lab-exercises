package com.debug.ex03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SensorLoopTest {

    @Test
    @DisplayName("Verify loop iterates over sensors without throwing ArrayIndexOutOfBoundsException")
    void testSensorLoopBounds() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should iterate over all sensor values without throwing ArrayIndexOutOfBoundsException");
    }
}
