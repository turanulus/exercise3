package com.turanulus.exercise3.service;

import com.turanulus.exercise3.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {
  private final OrderRepository orderRepository;
}
