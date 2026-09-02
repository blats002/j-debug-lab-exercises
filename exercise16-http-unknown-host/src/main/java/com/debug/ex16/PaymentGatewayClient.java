package com.debug.ex16;

import java.net.HttpURLConnection;
import java.net.URL;

public class PaymentGatewayClient {
    private final GatewayConfig config;

    public PaymentGatewayClient(GatewayConfig config) {
        this.config = config;
    }

    public int pingGateway() throws Exception {
        URL url = new URL(config.getEndpointUrl());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(config.getConnectTimeoutMs());
        conn.setReadTimeout(config.getReadTimeoutMs());

        try {
            return conn.getResponseCode();
        } finally {
            conn.disconnect();
        }
    }
}
