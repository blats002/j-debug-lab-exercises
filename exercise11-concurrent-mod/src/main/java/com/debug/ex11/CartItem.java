package com.debug.ex11;

/**
 * CartItem is an immutable domain model representing an individual product in a shopping cart.
 *
 * Design principles demonstrated:
 * 1. Immutability: Fields are marked 'final' so product data cannot be mutated unexpectedly.
 * 2. Encapsulation: Fields are private and accessed through public getter methods.
 */
public class CartItem {

    private final String sku;
    private final String name;
    private final double price;

    /**
     * Constructs a new CartItem.
     *
     * @param sku   unique stock keeping unit (e.g., "LAPTOP-PRO")
     * @param name  human-readable product name
     * @param price unit price in USD
     */
    public CartItem(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
