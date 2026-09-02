package com.debug.ex16;

public class App {
    public static void main(String[] args) throws Exception {
        GatewayConfig config = new GatewayConfig();
        PaymentGatewayClient client = new PaymentGatewayClient(config);

        int statusCode = client.pingGateway();
        System.out.println("Payment gateway ping status: " + statusCode);
    }
}