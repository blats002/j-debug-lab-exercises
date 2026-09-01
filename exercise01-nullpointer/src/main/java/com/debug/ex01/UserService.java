package com.debug.ex01;

public class UserService {
    // Solution: Initialize the array with elements upon declaration (or in constructor).
    // Why: When 'users' is null, indexing into it (users[index]) throws NullPointerException.
    // Initializing with valid user data ensures array memory is allocated and elements are accessible.
    private String[] users = {"Alice", "Bob", "Charlie"};

    // Retrieves user at specified 0-based index
    public String getUser(int index) {
        // Safe access: 'users' reference is guaranteed non-null
        return users[index];
    }
}