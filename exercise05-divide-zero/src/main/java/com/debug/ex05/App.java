package com.debug.ex05;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        TransactionAnalytics analytics = new TransactionAnalytics();
        
        // Simulating an hourly batch where no transactions occurred
        List<Transaction> hourlyBatch = new ArrayList<>();
        
        int averageAmount = analytics.calculateAverageAmount(hourlyBatch);
        System.out.println("Hourly average transaction amount: $" + averageAmount);
    }
}