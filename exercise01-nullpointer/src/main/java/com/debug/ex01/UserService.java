package com.debug.ex01;

public class UserService {
    private String[] users = {"Alice", "Bob", "Charlie"};
    public String getUser(int index) {
        return users[index];
    }
}