package com.open.telemetry.service_a;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class A2Service {

    @Autowired
    private RestTemplate restTemplate;

    public String get() {
        log.info("Calling /a_2");
        return restTemplate.getForObject(
                "http://localhost:7002/a_2",
                String.class
        );
    }


}
