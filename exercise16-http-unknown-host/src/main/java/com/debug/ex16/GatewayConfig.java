package com.debug.ex16;

/**
 * GatewayConfig encapsulates connection endpoints and timeout properties
 * for external third-party payment infrastructure.
 */
public class GatewayConfig {

    private final String endpointUrl;
    private final int connectTimeoutMs;
    private final int readTimeoutMs;

    /**
     * Default constructor with valid production-like endpoint configuration.
     *
     * Solution: Correct the domain name to a valid resolvable host (e.g. "https://httpbin.org/status/200").
     * Why: The hostname 'httpbin.org2' does not exist in public or internal DNS records. When the JVM attempts
     * socket connection negotiation, the OS DNS resolver fails to map the host to an IP address, throwing
     * java.net.UnknownHostException. Providing a valid hostname allows DNS resolution to succeed.
     */
    public GatewayConfig() {
        this("https://httpbin.org/status/200", 5000, 5000);
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
