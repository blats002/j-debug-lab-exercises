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

        // Intentional bug: loop bound runs to readings.length,
        // causing readings[i + 1] to throw ArrayIndexOutOfBoundsException on last element
        for (int i = 0; i < readings.length; i++) {
            deltas[i] = readings[i + 1] - readings[i];
        }
        return deltas;
    }
}
