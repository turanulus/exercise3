package com.turanulus.exercise3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String sku;
    private BigDecimal price;
    private String name;
    private String description;
    private String imageUrl;
    private int shipmentDeliveryTimes;
    private boolean active;
    private Size size;
    private int inventoryPerSize;
}
