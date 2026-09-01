package com.debug.ex05;

public class Transaction {
    private final String id;
    private final int amount;

    public Transaction(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
}
