package com.fuelpass.orderService.controller;

import com.fuelpass.orderService.model.Order;
import com.fuelpass.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping(value = "/create")
    public Order createOrder(@RequestBody Order order) {
        order=orderService.placeOrder(order);
        return order;
    }

    @GetMapping("/all")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

}
