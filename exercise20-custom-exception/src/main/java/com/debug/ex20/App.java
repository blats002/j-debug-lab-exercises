package com.debug.ex20;

public class App {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        
        // Solution: Provide a valid domain parameter (e.g. quantity = 5 > 0) and catch OrderValidationException.
        // Why: OrderService enforces business domain constraints (quantity must be > 0). If quantity <= 0,
        // it throws a custom OrderValidationException. Supplying a valid quantity allows normal order processing,
        // and catching OrderValidationException ensures any validation rejections are reported with clean error messages.
        int quantity = 5;
        try {
            service.placeOrder(quantity);
        } catch (OrderValidationException e) {
            System.err.println("Order failed: " + e.getMessage());
        }
    }
}