package com.debug.ex11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartPromotionTest {

    @Test
    @DisplayName("Verify promotional bundle is applied to cart without ConcurrentModificationException")
    void testApplyAutoBundles() {
        CartPromotionService service = new CartPromotionService();
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("LAPTOP-PRO", "Laptop", 1200.0));
        cart.addItem(new CartItem("MOUSE-WL", "Mouse", 30.0));

        assertDoesNotThrow(() -> service.applyAutoBundles(cart),
            "applyAutoBundles should add promotional items without throwing ConcurrentModificationException");

        assertEquals(3, cart.getItemCount(), "Cart should contain initial items plus the promotional gift");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing ConcurrentModificationException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should execute cart promotions without throwing ConcurrentModificationException");
    }
}
