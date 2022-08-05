package com.fuelpass.orderService.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

    private static final long serialVersionUID = -4551953276601557391L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double availableStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(double availableStock) {
        this.availableStock = availableStock;
    }
}
