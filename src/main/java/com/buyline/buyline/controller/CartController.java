package com.buyline.buyline.controller;

import com.buyline.buyline.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService cartService;

    public CartController ( CartService cartService ) {
        this.cartService = cartService;
    }

    @PostMapping()
    public ResponseEntity<String> createCart ( ) {

    }
}
