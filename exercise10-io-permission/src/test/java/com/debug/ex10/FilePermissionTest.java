package com.debug.ex10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilePermissionTest {

    @Test
    @DisplayName("Verify file writing writes to a permitted writable location")
    void testFileWriting() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should write to a writable location without throwing IOException or AccessDeniedException");
    }
}
