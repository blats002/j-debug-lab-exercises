package com.debug.ex01;

public class UserService {
    private String[] users = null;

    public String getUser(int index) {
        if (users != null) {
            users = new String[]{"Alice", "Bob", "Charlie"};
        }
        return users[index];
    }
}