package com.buyline.buyline.controller;

import com.buyline.buyline.dto.ProductInformDto;
import com.buyline.buyline.model.Product;
import com.buyline.buyline.service.ProductService;
import com.buyline.buyline.utils.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController ( ProductService productService ) {
        this.productService = productService;
    }

    // Creating a product
    @PostMapping()
    public ResponseEntity<Product> createProduct (@RequestBody ProductInformDto productInform ) {
        Product newProduct = this.productService.createProduct(productInform.getProductName(), productInform.getProductDescription(), productInform.getProductPrice(), productInform.getProductRating());
        return ResponseEntity.ok(newProduct);
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts () {
        return ResponseEntity.ok(this.productService.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct ( @PathVariable("id") String id ) {
        int productId = Integer.parseInt(id);
        return ResponseEntity.ok(this.productService.getProduct(productId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> deleteProduct ( @PathVariable("id") String id ) {
        int productId = Integer.parseInt(id);
        Product deleteProduct = this.productService.deleteProduct(productId);
        ApiResponse response = new ApiResponse("Deleted Product", deleteProduct, HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> updateProduct (@PathVariable("id") String id, @RequestBody ProductInformDto productInform ) {
        int productId = Integer.parseInt(id);
        Product updateProduct = this.productService.updateProduct(productId, productInform);
        ApiResponse response = new ApiResponse("Updated Product", updateProduct, HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
