package com.debug.ex12;

public class StateMachine {

    private boolean initialized = false;

    public void process() {
        if (!initialized) {
            throw new IllegalStateException("Not initialized");
        }
        System.out.println("Processing...");
    }
}