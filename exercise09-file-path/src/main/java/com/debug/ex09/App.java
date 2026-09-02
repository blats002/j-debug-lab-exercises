package com.debug.ex09;

import java.io.IOException;

/**
 * Application entry point demonstrating configuration bootstrapping:
 * 1. Obtains the configuration file path from ConfigPathProvider.
 * 2. Parses the configuration via AppConfigLoader.
 * 3. Prints the loaded environment settings.
 */
public class App {

    public static void main(String[] args) throws IOException {
        ConfigPathProvider pathProvider = new ConfigPathProvider();
        AppConfigLoader loader = new AppConfigLoader();

        String path = pathProvider.getConfigFilePath();
        AppConfig config = loader.loadConfiguration(path);

        System.out.println("Loaded config for environment: " + config.getEnvironment()
                + " [maxConnections=" + config.getMaxConnections() + "]");
    }
}