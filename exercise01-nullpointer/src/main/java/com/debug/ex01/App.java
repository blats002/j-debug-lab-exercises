package com.debug.ex01;

public class App {
    public static void main(String[] args) {
        UserDirectoryService directoryService = new UserDirectoryService();
        UserProfile user = directoryService.getUser(101L);

        System.out.println("Loaded User: " + user.getName() + " (" + user.getRole() + ")");
    }
}