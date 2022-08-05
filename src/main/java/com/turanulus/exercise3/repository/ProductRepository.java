package com.turanulus.exercise3.repository;

import com.turanulus.exercise3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {}
