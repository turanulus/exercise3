package com.turanulus.exercise3.controller;

import com.turanulus.exercise3.model.Order;
import com.turanulus.exercise3.model.Product;
import com.turanulus.exercise3.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

  private final OrderService orderService;

  // specific size
  public ResponseEntity<Order> createOrder(List<Product> productList) {
    return ResponseEntity.ok(new Order());
  }

  // return order
}
