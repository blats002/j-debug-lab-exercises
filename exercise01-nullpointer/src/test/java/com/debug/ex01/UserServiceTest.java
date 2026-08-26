package com.debug.ex01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    @DisplayName("Verify UserService returns user at valid index without NullPointerException")
    void testGetUser() {
        UserService service = new UserService();
        assertNotNull(service.getUser(0), "UserService.getUser(0) should return a valid user string, but returned null or threw NPE");
        assertEquals("Alice", service.getUser(0), "Expected user at index 0 to be 'Alice'");
        assertEquals("Bob", service.getUser(1), "Expected user at index 1 to be 'Bob'");
        assertEquals("Charlie", service.getUser(2), "Expected user at index 2 to be 'Charlie'");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing NullPointerException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), "App.main should execute without throwing NullPointerException");
    }
}
