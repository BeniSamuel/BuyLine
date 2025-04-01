package com.buyline.buyline.controller;

import com.buyline.buyline.dto.ProductInformDto;
import com.buyline.buyline.model.Product;
import com.buyline.buyline.service.ProductService;
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
    public ResponseEntity<Product> deleteProduct ( @PathVariable("id") String id ) {
        int productId = Integer.parseInt(id);
        return new ResponseEntity.ok(this.productService.deleteProduct(productId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct ( @PathVariable("id") String id, @RequestBody ProductInformDto productInform ) {
        int productId = Integer.parseInt(id);
        return new ResponseEntity.ok(this.productService.updateProduct(productId, productInform));
    }

}
