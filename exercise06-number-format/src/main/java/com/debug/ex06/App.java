package com.debug.ex06;

public class App {
    public static void main(String[] args) {
        String input = "abc";

        // Solution: Wrap string-to-number parsing in a try-catch block catching NumberFormatException.
        // Why: Integer.parseInt(String) expects a valid numeric string. If the input contains letters,
        // symbols, or malformed data, it throws NumberFormatException. Catching the exception allows the
        // application to report invalid user input gracefully rather than terminating abruptly.
        try {
            int value = Integer.parseInt(input);
            System.out.println("Parsed integer value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric value provided: '" + input + "'");
        }
    }
}