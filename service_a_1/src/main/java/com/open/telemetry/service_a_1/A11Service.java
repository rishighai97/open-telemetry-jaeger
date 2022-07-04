package com.open.telemetry.service_a_1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class A11Service {

    @Autowired
    private RestTemplate restTemplate;

    public String get()  {
        log.info("Calling /a_1_1");
        return restTemplate.getForObject(
                "http://localhost:7003/a_1_1",
                String.class
        );
    }

}
