package com.turanulus.exercise3.repository;

import com.turanulus.exercise3.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {}
