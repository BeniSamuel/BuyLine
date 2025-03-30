package com.buyline.buyline.model;

public class Product {

    private String productName;
    private String productDescription;
    private Double productPrice;
    private Float productRating;

    public Product ( String name, String description, Double price, Float rating ) {
        productName = name;
        productDescription = description;
        productPrice = price;
        productRating = rating;
    }
}
