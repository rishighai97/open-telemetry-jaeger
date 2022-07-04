package com.open.telemetry.service_a_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configs {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
