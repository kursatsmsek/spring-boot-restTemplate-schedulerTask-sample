package com.devkursat.resttemplatecronjobsample.service;

import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ApiService {

    private RestTemplate restTemplate;

    private HttpHeaders httpHeaders;

    private static final String CHAHRACTER_API = "https://rickandmortyapi.com/api/character";

    public Object getAllCharacter() {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<Object> response = restTemplate.exchange(CHAHRACTER_API, HttpMethod.GET,
                entity, Object.class);

        return response.getBody();
    }
}