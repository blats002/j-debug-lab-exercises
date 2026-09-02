package com.debug.ex09;

import java.io.IOException;

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