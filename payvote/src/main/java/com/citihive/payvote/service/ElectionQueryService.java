package com.citihive.payvote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citihive.payvote.config.AppConfig;

@Service
public class ElectionQueryService {

	 @Autowired
	 private AppConfig appConfig;
  

    private final RestTemplate restTemplate;

    public ElectionQueryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getElections() {
    	String baseUrl = AppConfig.BASE_API_URL;
        String apiKey = AppConfig.API_KEY;
        String url = baseUrl + "elections?key=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}
