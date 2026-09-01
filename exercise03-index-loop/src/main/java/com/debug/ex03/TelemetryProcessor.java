package com.debug.ex03;

public class TelemetryProcessor {

    /**
     * Computes consecutive sample rate-of-change (deltas) across the sensor buffer.
     */
    public double[] computeMovingDeltas(double[] readings) {
        if (readings == null || readings.length < 2) {
            return new double[0];
        }
        double[] deltas = new double[readings.length - 1];

        // Safe loop bound: stops at readings.length - 1 so readings[i + 1] remains within bounds
        for (int i = 0; i < readings.length - 1; i++) {
            deltas[i] = readings[i + 1] - readings[i];
        }
        return deltas;
    }
}
