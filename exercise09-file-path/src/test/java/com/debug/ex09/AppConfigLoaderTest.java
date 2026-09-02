package com.debug.ex09;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppConfigLoaderTest {

    @Test
    @DisplayName("Verify AppConfigLoader loads configuration from valid path without FileNotFoundException")
    void testLoadConfiguration() throws Exception {
        AppConfigLoader loader = new AppConfigLoader();
        AppConfig config = loader.loadConfiguration("config/app-config.properties");

        assertNotNull(config);
        assertEquals("production", config.getEnvironment());
        assertEquals(50, config.getMaxConnections());
        assertTrue(config.isFeatureEnabled());
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing FileNotFoundException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should locate config/app-config.properties and run without FileNotFoundException");
    }
}
