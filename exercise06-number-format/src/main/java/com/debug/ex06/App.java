package com.debug.ex06;

public class App {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        PaymentRecordParser parser = new PaymentRecordParser();

        // Solution: TransactionService supplies incoming payment string; parser sanitizes currency before parsing.
        // Why: Parsing un-sanitized currency strings throws NumberFormatException; using a sanitizing parser
        // converts formatted money values safely into structured domain records.
        String incomingCsv = transactionService.getTransaction();
        PaymentRecord record = parser.parse(incomingCsv);

        System.out.println("Processed payment for " + record.getTransactionId() + ": $" + record.getAmountInDollars());
    }
}