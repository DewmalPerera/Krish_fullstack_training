package com.fuelpass.orderService.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuelpass.orderService.model.Order;
import com.fuelpass.orderService.repository.OrderRepository;
import com.fuelpass.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Value("${order.topic.name}")
    private String topicName;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    ObjectMapper om=new ObjectMapper();


    public Order placeOrder(Order order){
        order =orderRepository.save(order);
        order.setStatus("CREATED");
        // after saving order lets release msg for payment service
        String message= null;
        try {
            message = om.writeValueAsString(order);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        kafkaTemplate.send(topicName,message);
        return order;
    }
    public List<Order> getAllOrders() {
        List<Order> orders= (List<Order>) orderRepository.findAll();
        return orders;
    }
}
