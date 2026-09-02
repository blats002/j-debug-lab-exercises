package com.debug.ex11;

public class CartDataService {

    public ShoppingCart getCustomerCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("LAPTOP-PRO", "Pro Developer Laptop", 1899.00));
        cart.addItem(new CartItem("MOUSE-WL", "Wireless Ergonomic Mouse", 49.99));
        cart.addItem(new CartItem("KEYBD-MEC", "Mechanical Keyboard", 119.00));
        return cart;
    }
}
