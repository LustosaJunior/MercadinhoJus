package com.market.mercadinhoJus.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/market")
public class MarketController {

    private static final Logger log = LoggerFactory.getLogger(MarketController.class);

    @GetMapping(value = "healthcheck")
    public ResponseEntity<?> healthCheck() {
        return new ResponseEntity<>(HttpStatus.OK, HttpStatus.OK);
    }
}
