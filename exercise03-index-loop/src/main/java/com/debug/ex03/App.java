package com.debug.ex03;

public class App {
    public static void main(String[] args) {
        SensorFeedService feedService = new SensorFeedService();
        TelemetryProcessor processor = new TelemetryProcessor();

        double[] telemetry = feedService.getLatestReadings();
        double[] deltas = processor.computeMovingDeltas(telemetry);

        System.out.println("Computed " + deltas.length + " telemetry deltas successfully.");
    }
}