package com.debug.ex20;

public class App {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        int quantity = 5;
        try {
            service.placeOrder(quantity);
        } catch (OrderValidationException e) {
            System.err.println("Order failed: " + e.getMessage());
        }
    }
}