package com.debug.ex02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserControllerTest {

    @Test
    @DisplayName("Verify UserController executes printUser without NullPointerException when dependencies are wired")
    void testPrintUser() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should execute UserController.printUser() without throwing NullPointerException");
    }
}
