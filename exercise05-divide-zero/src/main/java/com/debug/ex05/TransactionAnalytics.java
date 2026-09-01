package com.debug.ex05;

import java.util.List;

public class TransactionAnalytics {

    public int calculateAverageAmount(List<Transaction> transactions) {
        // Solution: Guard check for null or empty list before performing division.
        // Why: If the transaction list has size 0, performing integer division 'total / transactions.size()'
        // evaluates to 'total / 0', which throws ArithmeticException: / by zero.
        // Returning a fallback (0) safely handles quiet time windows where no transactions occurred.
        if (transactions == null || transactions.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Transaction tx : transactions) {
            total += tx.getAmount();
        }
        
        // Safe division: denominator (transactions.size()) is guaranteed >= 1
        return total / transactions.size();
    }
}
