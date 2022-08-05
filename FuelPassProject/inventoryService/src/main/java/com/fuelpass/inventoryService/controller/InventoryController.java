package com.fuelpass.inventoryService.controller;

import com.fuelpass.inventoryService.model.Inventory;
import com.fuelpass.inventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;

    @GetMapping("/all")
    public List<Inventory> getAllUser() {
        List<Inventory> users = (List<Inventory>) inventoryRepository.findAll();
        return users;
    }

    @PostMapping("/save")
    public Inventory saveUser(@RequestBody Inventory inventory) {
        inventory = inventoryRepository.save(inventory);
        return inventory;
    }
}
