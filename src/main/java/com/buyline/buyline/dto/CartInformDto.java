package com.buyline.buyline.dto;

import com.buyline.buyline.model.Product;
import java.util.List;

public class CartInformDto {
    private int cartId;
    private List<Product> products;
    private Double cartValue;

    public int getCartId () { return this.cartId; }
    public Double getCartValue () { return this.getCartValue(); }
}
