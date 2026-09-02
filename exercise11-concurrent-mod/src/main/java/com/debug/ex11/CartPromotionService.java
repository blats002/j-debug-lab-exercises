package com.debug.ex11;

public class CartPromotionService {

    public void applyAutoBundles(ShoppingCart cart) {
        for (CartItem item : cart.getItems()) {
            if ("LAPTOP-PRO".equals(item.getSku())) {
                cart.addItem(new CartItem("FREE-SLEEVE", "Laptop Protective Sleeve (Gift)", 0.0));
            }
        }
    }
}
