package com.turanulus.exercise3.service;

import com.turanulus.exercise3.dto.CardReqBody;
import com.turanulus.exercise3.model.Card;
import com.turanulus.exercise3.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CardService {

  private CardRepository cardRepository;

  public void createCard(CardReqBody cardReqBody) {
    Card card = new Card();

    cardRepository.save(card);
  }
}
