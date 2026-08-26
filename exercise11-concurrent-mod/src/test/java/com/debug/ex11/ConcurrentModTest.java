package com.debug.ex11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcurrentModTest {

    @Test
    @DisplayName("Verify list modification during traversal completes without ConcurrentModificationException")
    void testSafeIteration() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should safely update or iterate over the list without throwing ConcurrentModificationException");
    }
}
