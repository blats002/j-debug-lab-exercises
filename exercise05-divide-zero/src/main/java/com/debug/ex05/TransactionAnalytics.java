package com.debug.ex05;

import java.util.List;

public class TransactionAnalytics {

    public int calculateAverageAmount(List<Transaction> transactions) {
        int total = 0;
        for (Transaction tx : transactions) {
            total += tx.getAmount();
        }
        // Intentional bug: dividing by size without checking if list is empty
        return total / transactions.size();
    }
}
