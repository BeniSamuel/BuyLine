package com.buyline.buyline.controller;

import com.buyline.buyline.service.CartService;
import com.buyline.buyline.utils.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.buyline.buyline.model.Cart;

@RestController
@RequestMapping(path="/api/v1/cart")
public class CartController {
    private final CartService cartService;

    public CartController ( CartService cartService ) {
        this.cartService = cartService;
    }

    

}
