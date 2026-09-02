package com.debug.ex06;

public class PaymentRecord {
    private final String transactionId;
    private final int amountInDollars;
    private final String currency;

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
