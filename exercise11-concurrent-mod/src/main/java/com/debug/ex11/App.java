package com.debug.ex11;

/**
 * Application entry point demonstrating shopping cart checkout workflow:
 * 1. Loads customer's active cart via CartDataService.
 * 2. Applies business promotions & auto-bundled items via CartPromotionService.
 * 3. Prints final processed cart size.
 */
public class App {

    public static void main(String[] args) {
        CartDataService cartDataService = new CartDataService();
        CartPromotionService promoService = new CartPromotionService();

        ShoppingCart cart = cartDataService.getCustomerCart();
        promoService.applyAutoBundles(cart);

        System.out.println("Cart processed successfully with " + cart.getItemCount() + " items.");
    }
}