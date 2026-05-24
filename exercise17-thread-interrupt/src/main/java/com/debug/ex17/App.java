package com.debug.ex17;

public class App {
    public static void main(String[] args) throws Exception {
        Thread worker = new Thread(new Worker());
        worker.start();
        Thread.sleep(100);
        worker.interrupt();
    }
}