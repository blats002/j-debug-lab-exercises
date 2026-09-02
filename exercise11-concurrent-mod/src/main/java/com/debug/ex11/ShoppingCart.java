package com.debug.ex11;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart encapsulates the collection of items selected by a customer.
 *
 * Real-world context:
 * In shopping carts and checkout engines, carts are populated dynamically with
 * customer-selected items, bundles, discounts, and auto-applied gifts.
 */
public class ShoppingCart {

    private final List<CartItem> items = new ArrayList<>();

    /**
     * Adds a single item to the cart.
     */
    public void addItem(CartItem item) {
        items.add(item);
    }

    /**
     * Adds a collection of items to the cart in batch.
     */
    public void addItems(List<CartItem> newItems) {
        items.addAll(newItems);
    }

    /**
     * Returns the live list of cart items.
     */
    public List<CartItem> getItems() {
        return items;
    }

    /**
     * Returns the total count of items in the cart.
     */
    public int getItemCount() {
        return items.size();
    }
}
