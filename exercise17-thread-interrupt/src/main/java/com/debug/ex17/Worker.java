package com.debug.ex17;

public class Worker implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.out.println("Worker received interruption and terminated gracefully.");
        }
    }
}