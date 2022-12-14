package com.turanulus.exercise3.repository;

import com.turanulus.exercise3.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {}
