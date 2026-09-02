package com.debug.ex09;

/**
 * AppConfig is an immutable configuration model storing application runtime properties.
 */
public class AppConfig {

    private final String environment;
    private final int maxConnections;
    private final boolean featureEnabled;

    public AppConfig(String environment, int maxConnections, boolean featureEnabled) {
        this.environment = environment;
        this.maxConnections = maxConnections;
        this.featureEnabled = featureEnabled;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isFeatureEnabled() {
        return featureEnabled;
    }
}
