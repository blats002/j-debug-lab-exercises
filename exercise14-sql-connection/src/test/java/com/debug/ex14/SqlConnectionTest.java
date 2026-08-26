package com.debug.ex14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqlConnectionTest {

    @Test
    @DisplayName("Verify JDBC connection establishes successfully with valid database parameters")
    void testConnection() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should connect to the database without throwing SQLException");
    }
}
