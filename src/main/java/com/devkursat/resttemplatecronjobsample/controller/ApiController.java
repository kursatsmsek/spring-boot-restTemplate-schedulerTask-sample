package com.devkursat.resttemplatecronjobsample.controller;

import com.devkursat.resttemplatecronjobsample.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ApiController {

    private ApiService apiService;

    @GetMapping("/")
    public ResponseEntity<Object> getCharacters() {
        Object object = apiService.getAllCharacter();
        return ResponseEntity.ok().body(object);
    }
}
