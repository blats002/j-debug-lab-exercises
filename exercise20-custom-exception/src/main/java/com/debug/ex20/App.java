package com.debug.ex20;

public class App {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.placeOrder(-5);
    }
}