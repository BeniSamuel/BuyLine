package com.buyline.buyline.service;

import com.buyline.buyline.dto.OrderInformDto;
import org.springframework.stereotype.Service;
import com.buyline.buyline.model.Order;
import java.util.List;
import java.util.ArrayList;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<Order>();

    public Order getOrder ( int id ) {
        for ( Order order: orders ) {
            if ( order.getOrderId() == id ) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders () {
        return orders;
    }

    public void deleteOrder ( int id ) {
        for ( Order order: orders ) {
            if ( order.getOrderId() == id ) {
                orders.remove(order);
            }
        }
    }

    public void updateOrder (int id, OrderInformDto orderInformDto) {

    }
}