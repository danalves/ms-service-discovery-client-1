package com.danalves.ms_controle_animais.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/animal")
@Slf4j
@RequiredArgsConstructor
public class AnimalController {

    private final RestTemplate restTemplate;

    @GetMapping("/list")
    public ResponseEntity<String> listAnimals() {
        String result = restTemplate.getForObject("http://ms-client-2/list", String.class);
        return ResponseEntity.ok(result);
    }
}
