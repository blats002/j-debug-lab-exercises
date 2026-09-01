package com.debug.ex12;

public class App {
    public static void main(String[] args) {
        StateMachine machine = new StateMachine();

        // Solution: Call initialize() before calling process().
        // Why: Calling methods out-of-order on lifecycle-managed objects throws IllegalStateException.
        // Fulfilling the object's lifecycle requirements transitions it into a valid state for processing.
        machine.initialize();
        machine.process();
    }
}