package com.buyline.buyline.controller;

import com.buyline.buyline.model.Order;
import com.buyline.buyline.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController ( OrderService orderService ) {
        this.orderService = orderService;
    }

    @GetMapping("")
    public ResponseEntity<List<Order>> getAllOrders () {
        List<Order> orders = new ArrayList<>();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder (@PathVariable int id ) {
        return ResponseEntity.ok(this.orderService.getOrder(id));
          //  return ResponseEntity(this.orderService.getOrder)
    }
}
