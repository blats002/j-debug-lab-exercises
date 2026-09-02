package com.debug.ex16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentGatewayTest {

    @Test
    @DisplayName("Verify PaymentGatewayClient connects to valid host without UnknownHostException")
    void testGatewayConnection() throws Exception {
        GatewayConfig config = new GatewayConfig("https://httpbin.org/status/200", 5000, 5000);
        PaymentGatewayClient client = new PaymentGatewayClient(config);

        int statusCode = client.pingGateway();
        assertEquals(200, statusCode, "Expected HTTP 200 OK response from valid gateway endpoint");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing UnknownHostException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should connect to a valid hostname without throwing UnknownHostException");
    }
}
