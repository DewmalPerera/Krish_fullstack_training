package com.fuelpass.orderService.service;

import com.fuelpass.orderService.model.Order;

import java.util.List;

public interface OrderService {
    Order placeOrder(Order order);
    List<Order> getAllOrders();


}
