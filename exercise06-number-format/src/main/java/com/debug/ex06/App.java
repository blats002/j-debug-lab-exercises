package com.debug.ex06;

/**
 * Application entry point demonstrating service orchestration:
 * 1. Ingests raw data from TransactionService.
 * 2. Passes raw payload to PaymentRecordParser for parsing and sanitization.
 * 3. Prints the resulting structured PaymentRecord.
 */
public class App {

    public static void main(String[] args) {
        // Initialize services
        TransactionService transactionService = new TransactionService();
        PaymentRecordParser parser = new PaymentRecordParser();

        // Fetch raw payment data from upstream feed
        String incomingCsv = transactionService.getTransaction();

        // Parse raw CSV string into a validated domain record
        PaymentRecord record = parser.parse(incomingCsv);

        // Output processed transaction summary
        System.out.println("Processed payment for " + record.getTransactionId() + ": $" + record.getAmountInDollars());
    }
}