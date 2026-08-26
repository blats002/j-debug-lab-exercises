package com.debug.ex09;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilePathTest {

    @Test
    @DisplayName("Verify file reading operates without FileNotFoundException")
    void testFileReading() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should reference an existing file path and read the content without throwing FileNotFoundException");
    }
}
