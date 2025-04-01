package com.buyline.buyline.model;

public class Product {

    private int productId = 0;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Float productRating;

    public Product ( String name, String description, Double price, Float rating ) {
        this.productId ++;
        productName = name;
        productDescription = description;
        productPrice = price;
        productRating = rating;
    }

    public void setProductName ( String name ) { this.productName = name; }
    public void setProductDescription ( String productDescription ) { this.productDescription = productDescription; }
    public void setProductRating ( Float productRating ) { this.productRating = productRating; }
    public void setProductPrice ( Double productPrice ) { this.productPrice = productPrice; }

    public int getProductId () { return this.productId; }
    public String getProductName () { return this.productName; }
    public String getProductDescription () { return this.productDescription; }
    public Float getProductRating () { return this.productRating; }
    public Double getProductPrice () { return this.productPrice; }

}
