package com.turanulus.exercise3.controller;

import com.turanulus.exercise3.dto.CardReqBody;
import com.turanulus.exercise3.dto.ProductToCardReqBody;
import com.turanulus.exercise3.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/cards")
public class CardController {

  private final CardService cardService;

  private final RqueueMessageEnqueu rqueueMessageEnqueuer;

  @PostMapping
  public ResponseEntity<Void> createCard(CardReqBody cardReqBody) {
    cardService.createCard(cardReqBody);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/product-to-card")
  public ResponseEntity<Void> addProductToCard(ProductToCardReqBody productToCardReqBody) {
    cardService.addProductToCard(productToCardReqBody);
    return ResponseEntity.ok().build();
  }
}
