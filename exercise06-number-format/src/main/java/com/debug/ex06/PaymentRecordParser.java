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

        // Solution: Strip non-numeric formatting characters (e.g. '$', ',', spaces) before parsing.
        // Why: Integer.parseInt() requires a strictly numeric digit sequence. Incoming transaction feeds
        // often include currency symbols (e.g. '$1250') or thousand separators, which throw NumberFormatException.
        // Sanitizing the raw string extracts the clean numeric value safely.
        String cleanAmount = rawAmount.replaceAll("[^0-9-]", "");
        int amount = Integer.parseInt(cleanAmount);

        return new PaymentRecord(txId, amount, currency);
    }
}
