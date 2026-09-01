package com.debug.ex17;

public class Worker implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Solution: Restore thread interrupted status with Thread.currentThread().interrupt() and exit gracefully.
            // Why: When Thread.sleep() or wait() is interrupted, Java clears the thread's interrupted status flag
            // before throwing InterruptedException. Throwing an unhandled RuntimeException crashes the thread,
            // while swallowing the exception erases the interruption signal. Re-interrupting the thread preserves
            // the signal for caller frameworks/executors to shut down cleanly.
            Thread.currentThread().interrupt();
            System.out.println("Worker thread interrupted safely; terminating execution.");
        }
    }
}