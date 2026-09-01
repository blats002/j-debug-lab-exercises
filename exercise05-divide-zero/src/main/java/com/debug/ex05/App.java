package com.debug.ex05;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TransactionBatchService batchService = new TransactionBatchService();
        TransactionAnalytics analytics = new TransactionAnalytics();

        List<Transaction> hourlyBatch = batchService.getHourlyBatch();
        int averageAmount = analytics.calculateAverageAmount(hourlyBatch);

        System.out.println("Hourly average transaction amount: $" + averageAmount);
    }
}