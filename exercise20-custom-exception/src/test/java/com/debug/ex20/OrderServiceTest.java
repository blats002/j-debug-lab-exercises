package com.debug.ex20;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    @DisplayName("Verify valid order quantity succeeds")
    void testValidOrderPlacement() {
        OrderService service = new OrderService();
        assertDoesNotThrow(() -> service.placeOrder(5), 
            "Placing an order with positive quantity should succeed");
    }

    @Test
    @DisplayName("Verify invalid order quantity throws OrderValidationException")
    void testInvalidOrderThrowsCustomException() {
        OrderService service = new OrderService();
        assertThrows(OrderValidationException.class, () -> service.placeOrder(-5), 
            "Placing an order with negative quantity must throw OrderValidationException");
        assertThrows(OrderValidationException.class, () -> service.placeOrder(0), 
            "Placing an order with zero quantity must throw OrderValidationException");
    }

    @Test
    @DisplayName("Verify App handles order placement safely without unhandled exception crash")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should validate order input or handle OrderValidationException gracefully");
    }
}
