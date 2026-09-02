package com.debug.ex01;

/**
 * Application entry point demonstrating directory lookup:
 * 1. Instantiates UserDirectoryService.
 * 2. Requests user profile by ID (101L).
 * 3. Prints loaded user summary.
 */
public class App {

    public static void main(String[] args) {
        UserDirectoryService directoryService = new UserDirectoryService();
        UserProfile user = directoryService.getUser(101L);

        System.out.println("Loaded User: " + user.getName() + " (" + user.getRole() + ")");
    }
}