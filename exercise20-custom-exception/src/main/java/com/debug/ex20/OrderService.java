package com.debug.ex20;

public class OrderService {

    public void placeOrder(int quantity) {
        if (quantity <= 0) {
            throw new OrderValidationException("Quantity must be positive");
        }
        System.out.println("Order placed: " + quantity);
    }
}