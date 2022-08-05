package com.fuelpass.inventoryService.repository;

import com.fuelpass.inventoryService.model.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
}
