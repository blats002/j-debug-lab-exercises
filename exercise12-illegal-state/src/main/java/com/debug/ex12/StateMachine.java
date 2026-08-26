package com.debug.ex12;

public class StateMachine {

    private boolean initialized = false;

    public void initialize() {
        this.initialized = true;
    }

    public void process() {
        if (!initialized) {
            throw new IllegalStateException("Not initialized"); // BUG trigger
        }
        System.out.println("Processing...");
    }
}