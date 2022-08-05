package com.turanulus.exercise3.controller;

import com.turanulus.exercise3.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

  private final ProductService productService;

  // get the certain size product

  // get active or inactive products

  // search product

  // iterate product(paginate)

  // get ordered products (view list of what I have bought)
}
