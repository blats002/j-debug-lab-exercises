package com.debug.ex06;

/**
 * TransactionService simulates an upstream payment gateway or message queue feed.
 *
 * Real-world context:
 * In enterprise systems, incoming data from third-party webhooks, legacy databases,
 * or CSV feeds often contains formatted user inputs (e.g., currency symbols, comma separators,
 * or whitespace) that must be transformed into strongly-typed domain models.
 */
public class TransactionService {

    /**
     * Retrieves the latest raw transaction line from the upstream feed.
     * Format: TRANSACTION_ID,AMOUNT,CURRENCY
     *
     * @return a CSV formatted transaction string
     */
    public String getTransaction() {
        return "TX-10492,$1250,USD";
    }
}
