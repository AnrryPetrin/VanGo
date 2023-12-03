package com.facens.vango.controller;

import com.facens.vango.model.Card;
import com.facens.vango.model.CardDTO;
import com.facens.vango.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    CardRepository cardRepository;

    @GetMapping("/")
    public ResponseEntity<List<CardDTO>> getAllCards() {
        return ResponseEntity.status(HttpStatus.OK).body(cardRepository.findAll().stream().map(CardDTO::new).toList());
    }

    @PostMapping("/")
    public ResponseEntity<CardDTO> postCard(@RequestBody Card card) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new CardDTO(cardRepository.save(card)));
    }

}