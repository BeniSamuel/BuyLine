package com.buyline.buyline.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private List<Order> cartItem;
    private Double cartVqlue;

    public Cart () {
        cartItem = new ArrayList<>();
    }

    public void setCartId ( int cartId ) { this.cartId = cartId; }
    public void setCartValue ( Double cartValue ) { this.cartVqlue = cartValue; }

    public Double getCartValue () { return this.cartVqlue; }
    public int getCartId () { return this.cartId; }

}
