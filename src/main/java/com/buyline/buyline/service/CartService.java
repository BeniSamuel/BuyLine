package com.buyline.buyline.service;

import com.buyline.buyline.model.Cart;
import org.springframework.stereotype.Service;
import com.buyline.buyline.model.Order;
import java.util.List;

@Service
public class CartService {

    public Cart createCart ( List<Order> orders ) {
        Cart newCart = new Cart();
        newCart.setCartItems(orders);
        return newCart;
    }

}
