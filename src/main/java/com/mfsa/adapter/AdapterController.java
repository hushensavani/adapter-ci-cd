package com.mfsa.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AdapterController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getIp", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getIp() {
        String url = "https://api.ipify.org/?format=json";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}