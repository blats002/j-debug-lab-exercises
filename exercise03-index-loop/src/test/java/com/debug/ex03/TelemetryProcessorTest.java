package com.debug.ex03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelemetryProcessorTest {

    @Test
    @DisplayName("Verify consecutive telemetry deltas calculate accurately")
    void testDeltaCalculation() {
        TelemetryProcessor processor = new TelemetryProcessor();
        double[] readings = {10.0, 15.0, 12.0};
        double[] deltas = processor.computeMovingDeltas(readings);

        assertNotNull(deltas);
        assertEquals(2, deltas.length, "3 readings should yield 2 consecutive delta values");
        assertEquals(5.0, deltas[0], 0.0001, "First delta (15.0 - 10.0) should equal 5.0");
        assertEquals(-3.0, deltas[1], 0.0001, "Second delta (12.0 - 15.0) should equal -3.0");
    }

    @Test
    @DisplayName("Verify telemetry processor handles boundary without throwing ArrayIndexOutOfBoundsException")
    void testArrayBoundarySafety() {
        TelemetryProcessor processor = new TelemetryProcessor();
        double[] readings = {1.0, 2.0, 3.0, 4.0};

        assertDoesNotThrow(() -> {
            double[] deltas = processor.computeMovingDeltas(readings);
            assertEquals(3, deltas.length);
        }, "computeMovingDeltas should process array within bounds without throwing ArrayIndexOutOfBoundsException");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing ArrayIndexOutOfBoundsException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should compute moving deltas without throwing ArrayIndexOutOfBoundsException");
    }
}
