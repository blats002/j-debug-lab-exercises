package com.debug.ex06;

public class PaymentRecordParser {

    /**
     * Parses a CSV payment record in the format: TRANSACTION_ID,AMOUNT,CURRENCY
     */
    public PaymentRecord parse(String rawLine) {
        if (rawLine == null || rawLine.isBlank()) {
            throw new IllegalArgumentException("Payment line cannot be empty");
        }

        String[] parts = rawLine.split(",");
        String txId = parts[0].trim();
        String rawAmount = parts[1].trim();
        String currency = parts[2].trim();

        int amount = Integer.parseInt(rawAmount);

        return new PaymentRecord(txId, amount, currency);
    }
}
