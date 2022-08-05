package com.turanulus.exercise3.service;

import com.turanulus.exercise3.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {
  private final ProductRepository productRepository;
}
