package com.debug.ex19;

public class App {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static long factorial(long n) {
        return n * factorial(n - 1);
    }
}