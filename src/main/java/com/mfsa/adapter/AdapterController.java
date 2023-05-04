package com.mfsa.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AdapterController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/getIp")
    public String getIp() {
        String url = "https://api.ipify.org/?format=json";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}