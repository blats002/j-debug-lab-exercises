package com.debug.ex05;

import java.util.List;

public class TransactionAnalytics {

    public int calculateAverageAmount(List<Transaction> transactions) {
        if (transactions == null || transactions.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (Transaction tx : transactions) {
            total += tx.getAmount();
        }
        return total / transactions.size();
    }
}
