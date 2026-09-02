package com.debug.ex06;

/**
 * PaymentRecord is an immutable domain model (Value Object / POJO)
 * representing a structured, validated payment transaction.
 *
 * Design principles demonstrated:
 * 1. Immutability: Fields are marked 'final' so state cannot be modified after construction.
 * 2. Encapsulation: Fields are private and accessed through public getter methods.
 * 3. Strongly Typed: The monetary amount is stored as an integer rather than raw string.
 */
public class PaymentRecord {

    private final String transactionId;
    private final int amountInDollars;
    private final String currency;

    /**
     * Constructs a validated PaymentRecord.
     *
     * @param transactionId   unique transaction identifier (e.g., "TX-10492")
     * @param amountInDollars integer payment amount in dollars
     * @param currency        ISO currency code (e.g., "USD")
     */
    public PaymentRecord(String transactionId, int amountInDollars, String currency) {
        this.transactionId = transactionId;
        this.amountInDollars = amountInDollars;
        this.currency = currency;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getAmountInDollars() {
        return amountInDollars;
    }

    public String getCurrency() {
        return currency;
    }
}
