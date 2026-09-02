package com.debug.ex16;

/**
 * Application entry point demonstrating payment gateway health check:
 * 1. Loads gateway configuration (GatewayConfig).
 * 2. Instantiates PaymentGatewayClient.
 * 3. Executes remote ping and prints HTTP response code.
 */
public class App {

    public static void main(String[] args) throws Exception {
        GatewayConfig config = new GatewayConfig();
        PaymentGatewayClient client = new PaymentGatewayClient(config);

        int statusCode = client.pingGateway();
        System.out.println("Payment gateway ping status: " + statusCode);
    }
}