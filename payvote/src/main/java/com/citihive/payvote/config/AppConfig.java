package com.citihive.payvote.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	 @Bean
	 public RestTemplate restTemplate() {
	        return new RestTemplate();
	 }
    @Value("${base.api.url}")
    public static final String BASE_API_URL = null;

    @Value("${api.key}")
    public static final String API_KEY = null;
}
