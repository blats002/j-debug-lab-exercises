package com.debug.ex06;

public class App {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int value = Integer.parseInt(input);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric value: " + input);
        }
    }
}