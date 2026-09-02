package com.debug.ex09;

/**
 * ConfigPathProvider resolves the relative filesystem path to the application configuration file.
 *
 * Core learning objective:
 * Understanding relative path resolution in Java, how java.io.FileNotFoundException occurs
 * when directory names or file paths are mismatched, and how to verify file existence.
 */
public class ConfigPathProvider {

    /**
     * Returns the relative path to the configuration file.
     *
     * Solution: Correct the directory path from "configs/app-config.properties" to "config/app-config.properties".
     * Why: The directory in the project repository is named "config", not "configs".
     * Calling new FileReader("configs/app-config.properties") throws java.io.FileNotFoundException
     * because the operating system cannot locate a directory named "configs".
     *
     * @return the corrected relative configuration file path
     */
    public String getConfigFilePath() {
        return "config/app-config.properties";
    }
}
