package com.debug.ex13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqlSyntaxTest {

    @Test
    @DisplayName("Verify SQL query contains valid syntax and executes without SQLException")
    void testQueryExecution() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should execute valid SQL query syntax without throwing SQLException");
    }
}
