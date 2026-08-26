package com.debug.ex12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateMachineTest {

    @Test
    @DisplayName("Verify StateMachine lifecycle is respected before processing")
    void testStateMachineProcessing() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should initialize StateMachine prior to processing without throwing IllegalStateException");
    }
}
