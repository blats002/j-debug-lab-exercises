package com.debug.ex01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserProfileTest {

    @Test
    @DisplayName("Verify UserProfileRepository retrieves user profiles without NullPointerException")
    void testFindById() {
        UserProfileRepository repository = new UserProfileRepository();
        UserProfile user = repository.findById(101L);

        assertNotNull(user, "User profile should not be null");
        assertEquals("Alice Johnson", user.getName());
        assertEquals("ADMIN", user.getRole());
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing NullPointerException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should retrieve user profile without throwing NullPointerException");
    }
}
