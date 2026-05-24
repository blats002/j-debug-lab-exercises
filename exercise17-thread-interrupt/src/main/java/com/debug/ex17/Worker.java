package com.debug.ex17;

public class Worker implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted!", e); // to debug
        }
    }
}