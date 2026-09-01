package com.debug.ex12;

public class StateMachine {

    private boolean initialized = false;

    // Solution: Expose an explicit initialize() method to advance the state machine to ready state.
    // Why: StateMachine enforces an initialization contract. Calling process() when initialized == false
    // throws IllegalStateException. Providing initialize() allows callers to fulfill the contract.
    public void initialize() {
        this.initialized = true;
    }

    public void process() {
        if (!initialized) {
            throw new IllegalStateException("Not initialized");
        }
        System.out.println("Processing...");
    }
}