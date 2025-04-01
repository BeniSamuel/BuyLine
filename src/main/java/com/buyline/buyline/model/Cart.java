package com.buyline.buyline.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private List<Order> cartItems;
    private Double cartValue;

    public Cart () {
        cartItems = new ArrayList<>();
    }

    public void setCartId ( int cartId ) { this.cartId = cartId; }
    public void setCartValue ( Double cartValue ) { this.cartValue = cartValue; }

    public Double getCartValue () { return this.cartValue; }
    public List<Order> getCartItems () { return this.cartItems; }
    public int getCartId () { return this.cartId; }

}
