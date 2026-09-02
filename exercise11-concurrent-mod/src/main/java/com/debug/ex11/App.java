package com.debug.ex11;

public class App {
    public static void main(String[] args) {
        CartDataService cartDataService = new CartDataService();
        CartPromotionService promoService = new CartPromotionService();

        ShoppingCart cart = cartDataService.getCustomerCart();
        promoService.applyAutoBundles(cart);

        System.out.println("Cart processed successfully with " + cart.getItemCount() + " items.");
    }
}