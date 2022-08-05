package com.turanulus.exercise3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;

  @Column(name = "sku", updatable = false, nullable = false)
  private String sku;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "shipment_delivery_times")
  private int shipmentDeliveryTimes;

  @Column(name = "active")
  private boolean active;

  @Column(name = "size")
  private Size size;

  @Column(name = "inventory_per_size")
  private int inventoryPerSize;
}
