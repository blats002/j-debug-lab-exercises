package com.debug.ex07;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasspathLoaderTest {

    @Test
    @DisplayName("Verify valid plugin class loads and generates report successfully")
    void testValidPluginLoading() throws Exception {
        PluginLoader loader = new PluginLoader();
        ReportPlugin plugin = loader.loadPlugin("com.debug.ex07.plugins.PdfReportPlugin");

        assertNotNull(plugin, "PluginLoader should instantiate PdfReportPlugin");
        assertEquals("[PDF] Monthly Report: Revenue is up 12%", 
            plugin.generateReport("Monthly Report", "Revenue is up 12%"));
    }

    @Test
    @DisplayName("Verify invalid class name throws ClassNotFoundException")
    void testInvalidPluginThrowsClassNotFound() {
        PluginLoader loader = new PluginLoader();
        assertThrows(ClassNotFoundException.class, 
            () -> loader.loadPlugin("com.debug.ex07.missing.UnknownPlugin"),
            "Loading a non-existent class must throw ClassNotFoundException");
    }

    @Test
    @DisplayName("Verify App.main executes without throwing ClassNotFoundException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should configure a valid classpath plugin and execute without ClassNotFoundException");
    }
}
