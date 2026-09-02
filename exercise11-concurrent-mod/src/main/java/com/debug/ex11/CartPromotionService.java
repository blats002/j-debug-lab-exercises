package com.debug.ex11;

import java.util.ArrayList;
import java.util.List;

/**
 * CartPromotionService evaluates business rules and applies promotional bundles to a shopping cart.
 *
 * Core learning objective:
 * Understanding why java.util.ConcurrentModificationException occurs when mutating a Collection
 * during active traversal, and how to safely stage additions/removals.
 */
public class CartPromotionService {

    /**
     * Scans the cart for promotional triggers (e.g. buying a LAPTOP-PRO) and adds promotional items.
     *
     * How the fix works:
     * 1. Iteration creates an internal Iterator with an expected modification count (expectedModCount).
     * 2. Direct calls to cart.addItem() modify the underlying list's modCount, causing the iterator
     *    to throw ConcurrentModificationException on the subsequent iteration.
     * 3. Solution: Collect promotional items into a temporary staging list (bundleGifts) during traversal,
     *    and append them to the cart via cart.addItems(bundleGifts) AFTER the loop completes.
     *
     * @param cart the customer's active shopping cart
     */
    public void applyAutoBundles(ShoppingCart cart) {
        // Solution: Create a staging list to collect items to add without modifying the list being iterated
        List<CartItem> bundleGifts = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            if ("LAPTOP-PRO".equals(item.getSku())) {
                bundleGifts.add(new CartItem("FREE-SLEEVE", "Laptop Protective Sleeve (Gift)", 0.0));
            }
        }

        // Apply all staged bundle additions after iteration has finished safely
        cart.addItems(bundleGifts);
    }
}
