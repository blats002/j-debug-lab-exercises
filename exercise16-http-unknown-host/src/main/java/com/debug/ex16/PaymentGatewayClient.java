package com.debug.ex16;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * PaymentGatewayClient manages HTTP communication with the remote payment gateway.
 *
 * Core learning objective:
 * Understanding DNS hostname resolution in Java HTTP clients, how java.net.UnknownHostException occurs,
 * and the importance of configuring connection timeouts and clean socket disconnection.
 */
public class PaymentGatewayClient {

    private final GatewayConfig config;

    public PaymentGatewayClient(GatewayConfig config) {
        this.config = config;
    }

    /**
     * Pings the payment gateway endpoint to verify health and connectivity.
     *
     * @return HTTP status code from remote server (e.g. 200)
     * @throws Exception if network connection or DNS resolution fails
     */
    public int pingGateway() throws Exception {
        URL url = new URL(config.getEndpointUrl());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(config.getConnectTimeoutMs());
        conn.setReadTimeout(config.getReadTimeoutMs());

        try {
            return conn.getResponseCode();
        } finally {
            conn.disconnect(); // Ensure socket connection resources are closed
        }
    }
}
