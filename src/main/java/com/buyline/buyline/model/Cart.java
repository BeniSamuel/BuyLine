package com.buyline.buyline.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId = 0;
    private List<Order> cartItems;
    private Double cartValue = 0.00;

    public Cart () {
        cartId ++;
        cartItems = new ArrayList<>();
        for ( Order order: cartItems ) {
            cartValue = (Double) order.getProductPrice() + cartValue;
        }
    }

    public void setCartId ( int cartId ) { this.cartId = cartId; }
    public void setCartItems ( List<Order> orders ) { this.cartItems = orders; }
    public void setCartValue ( Double cartValue ) { this.cartValue = cartValue; }

    public Double getCartValue () { return this.cartValue; }
    public List<Order> getCartItems () { return this.cartItems; }
    public int getCartId () { return this.cartId; }

}
