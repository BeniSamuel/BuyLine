package com.buyline.buyline.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private List<Product> products;
    private Double orderPrice;

    public Order ( int orderId, Double orderPrice ) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.products = new ArrayList<>();
    }

    public void setOrderId ( int orderId ) { this.orderId = orderId; }
    public void setOrderPrice ( Double orderPrice ) { this.orderPrice = orderPrice; }
    // Getters
    public int getOrderId () { return this.orderId; }
    public List<Product> getProducts ( ) { return this.products; }
    public Double getProductPrice () { return this.orderPrice; }

}
