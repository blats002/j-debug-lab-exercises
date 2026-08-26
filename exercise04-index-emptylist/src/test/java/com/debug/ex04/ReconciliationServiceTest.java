package com.debug.ex04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReconciliationServiceTest {

    @Test
    @DisplayName("Verify reconciliation handles empty incoming product list safely")
    void testEmptyListReconciliation() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should handle an empty incoming products list without throwing IndexOutOfBoundsException");
    }
}
