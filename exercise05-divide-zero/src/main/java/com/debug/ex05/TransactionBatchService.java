package com.debug.ex05;

import java.util.ArrayList;
import java.util.List;

public class TransactionBatchService {

    /**
     * Simulates fetching transactions for the current hourly window.
     * Returns an empty batch if no transactions occurred.
     */
    public List<Transaction> getHourlyBatch() {
        return new ArrayList<>();
    }
}
