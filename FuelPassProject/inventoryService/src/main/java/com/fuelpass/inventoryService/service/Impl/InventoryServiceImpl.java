package com.fuelpass.inventoryService.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuelpass.inventoryService.model.Inventory;
import com.fuelpass.inventoryService.model.Order;
import com.fuelpass.inventoryService.repository.InventoryRepository;
import com.fuelpass.inventoryService.repository.OrderRepository;
import com.fuelpass.inventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Value("${order.topic.name}")
    private String topicName;

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    InventoryRepository inventoryRepository;

    @KafkaListener(topics = "order-topic", groupId = "foo")
    public void processOrder(String message){
        System.out.println("Received Message in group foo: " + message);
        ObjectMapper object = new ObjectMapper();
        Order order = null;
        try {
            order = object.readValue(message, Order.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Inventory inventory = inventoryRepository.findById(order.getInventoryId()).get();
        if (inventory.getAvailableStock() > order.getOrderAmount()) {
            inventory.setAvailableStock(inventory.getAvailableStock() - order.getOrderAmount());
            order.setStatus("SUCCESS");
            inventoryRepository.save(inventory);
            orderRepository.save(order);
        } else {
            order.setStatus("FAILED");
            orderRepository.save(order);
        }


    }

}
