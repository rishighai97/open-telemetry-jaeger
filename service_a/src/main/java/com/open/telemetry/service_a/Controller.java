package com.open.telemetry.service_a;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
@Slf4j
public class Controller {

    @Autowired
    private A1Service a1Service;

    @Autowired
    private A2Service a2Service;

    @GetMapping
    public String a() {
        log.info("In a");
        String a1 = a1Service.get();
        String a2 = a2Service.get();
        return "a";
    }

}
