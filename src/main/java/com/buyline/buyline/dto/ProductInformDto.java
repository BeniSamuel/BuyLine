package com.buyline.buyline.dto;

public class ProductInformDto {
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Float productRating;

    public String getProductName () { return this.productName; }
    public String getProductDescription () { return this.productDescription; }
    public Double getProductPrice () { return this.productPrice; }
    public Float getProductRating () { return this.productRating; }
}
