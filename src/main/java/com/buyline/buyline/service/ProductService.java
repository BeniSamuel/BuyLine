package com.buyline.buyline.service;

import com.buyline.buyline.dto.ProductInformDto;
import com.buyline.buyline.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    // Creating a product
    public Product createProduct (String productName, String productDescription, Double productPrice, Float productRating ) {
        Product newProduct = new Product(productName, productDescription, productPrice, productRating);
        products.add(newProduct);
        return newProduct;
    }

    // Getting products
    public List<Product> getProducts () {
        return products;
    }

    // Getting Product
    public Product getProduct ( int id ) {
        for ( Product product: products ) {
            if ( product.getProductId() == id ) {
                return product;
            }
        }
        return null;
    }

    // Deleting Product
    public Product deleteProduct ( int id ) {
        for ( Product product: products ) {
            if (product.getProductId() == id ) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }

    public Product updateProduct ( int id, ProductInformDto productInform ) {
        for ( Product product: products ) {
            if ( product.getProductId() == id ) {
                product.setProductName(productInform.getProductName());
                product.setProductDescription(productInform.getProductDescription());
                product.setProductPrice(productInform.getProductPrice());
                product.setProductRating(productInform.getProductRating());
                return product;
            }
        }
        return null;
    }

}
