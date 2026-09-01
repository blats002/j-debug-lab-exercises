package com.debug.ex05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionAnalyticsTest {

    @Test
    @DisplayName("Verify normal average transaction calculation works correctly")
    void testNormalCalculation() {
        TransactionAnalytics analytics = new TransactionAnalytics();
        List<Transaction> transactions = List.of(
            new Transaction("TX-101", 100),
            new Transaction("TX-102", 200),
            new Transaction("TX-103", 300)
        );
        assertEquals(200, analytics.calculateAverageAmount(transactions), 
            "Average of [100, 200, 300] should be 200");
    }

    @Test
    @DisplayName("Verify empty transaction batch returns 0 fallback without throwing ArithmeticException")
    void testEmptyBatchCalculation() {
        TransactionAnalytics analytics = new TransactionAnalytics();
        assertDoesNotThrow(() -> {
            int result = analytics.calculateAverageAmount(new ArrayList<>());
            assertEquals(0, result, "Empty batch should return 0 as fallback average");
        }, "Calculating average of empty batch should not throw ArithmeticException");
    }

    @Test
    @DisplayName("Verify App handles empty batch without crashing on ArithmeticException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should guard against divide-by-zero on empty transaction batches");
    }
}
