package com.debug.ex16;

public class GatewayConfig {
    private final String endpointUrl;
    private final int connectTimeoutMs;
    private final int readTimeoutMs;

    public GatewayConfig() {
        this("https://httpbin.org2/status/200", 5000, 5000);
    }

    public GatewayConfig(String endpointUrl, int connectTimeoutMs, int readTimeoutMs) {
        this.endpointUrl = endpointUrl;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }
}
