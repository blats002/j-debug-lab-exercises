package com.debug.ex07;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasspathLoaderTest {

    @Test
    @DisplayName("Verify Classpath loader finds target class without ClassNotFoundException")
    void testClassLoading() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should reference an existing class on the classpath without throwing ClassNotFoundException");
    }
}
