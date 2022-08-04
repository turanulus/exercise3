package com.turanulus.exercise3.controller;

import com.turanulus.exercise3.dto.CardReqBody;
import com.turanulus.exercise3.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/cards")
public class CardController {

  private CardService cardService;

  public ResponseEntity<Void> createCard(CardReqBody cardReqBody) {
    cardService.createCard(cardReqBody);
    return ResponseEntity.ok().build();
  }

  /*public ResponseEntity<> addProductToCard(){

  }*/
}
