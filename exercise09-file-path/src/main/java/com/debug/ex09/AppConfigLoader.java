package com.debug.ex09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * AppConfigLoader parses key-value property files from disk into strongly-typed AppConfig models.
 *
 * Best practices demonstrated:
 * 1. Try-with-resources: Ensures BufferedReader and underlying FileReader are closed cleanly.
 * 2. Defensive parsing: Ignores empty lines and comments, with fallback default values.
 */
public class AppConfigLoader {

    /**
     * Reads and parses a properties configuration file from the specified path.
     *
     * @param filePath relative or absolute path to the configuration properties file
     * @return parsed AppConfig domain entity
     * @throws IOException if the file does not exist or cannot be read
     */
    public AppConfig loadConfiguration(String filePath) throws IOException {
        Map<String, String> properties = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    continue; // Skip comments and empty lines
                }
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    properties.put(parts[0].trim(), parts[1].trim());
                }
            }
        }

        String env = properties.getOrDefault("environment", "development");
        int maxConn = Integer.parseInt(properties.getOrDefault("maxConnections", "10"));
        boolean feature = Boolean.parseBoolean(properties.getOrDefault("featureEnabled", "false"));

        return new AppConfig(env, maxConn, feature);
    }
}
