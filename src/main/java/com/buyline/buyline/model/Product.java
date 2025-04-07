package com.buyline.buyline.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name= "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Float productRating;


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
