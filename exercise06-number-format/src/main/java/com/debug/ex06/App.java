package com.debug.ex06;

public class App {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        PaymentRecordParser parser = new PaymentRecordParser();

        String incomingCsv = transactionService.getTransaction();
        PaymentRecord record = parser.parse(incomingCsv);

        System.out.println("Processed payment for " + record.getTransactionId() + ": $" + record.getAmountInDollars());
    }
}