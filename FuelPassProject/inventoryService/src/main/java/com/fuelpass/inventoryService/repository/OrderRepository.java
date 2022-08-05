package com.fuelpass.inventoryService.repository;

import com.fuelpass.inventoryService.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
