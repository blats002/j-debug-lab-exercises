package com.debug.ex09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppConfigLoader {

    public AppConfig loadConfiguration(String filePath) throws IOException {
        Map<String, String> properties = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
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
