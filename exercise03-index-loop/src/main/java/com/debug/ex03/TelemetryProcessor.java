package com.debug.ex03;

public class TelemetryProcessor {

    /**
     * Computes consecutive sample rate-of-change (deltas) across the sensor buffer.
     */
    public double[] computeMovingDeltas(double[] readings) {
        // Guard check: if buffer is null or contains fewer than 2 elements, no deltas can be computed
        if (readings == null || readings.length < 2) {
            return new double[0];
        }
        
        // N samples yield (N - 1) consecutive differences
        double[] deltas = new double[readings.length - 1];

        // Solution: Bound the loop to 'readings.length - 1' (or 'deltas.length').
        // Why: Inside the loop, we access 'readings[i + 1]'. If 'i' reached 'readings.length - 1',
        // 'readings[i + 1]' would attempt to access index 'readings.length', throwing ArrayIndexOutOfBoundsException.
        // Stopping at (readings.length - 1) guarantees 'i + 1' stays strictly within the array bounds.
        for (int i = 0; i < readings.length - 1; i++) {
            deltas[i] = readings[i + 1] - readings[i];
        }
        return deltas;
    }
}
