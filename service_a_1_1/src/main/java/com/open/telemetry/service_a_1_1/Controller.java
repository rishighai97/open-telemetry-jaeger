package com.open.telemetry.service_a_1_1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a_1_1")
@Slf4j
public class Controller {

    @GetMapping
    public String a_1_1() {
        log.info("In /a_1_1");
        sleep(500);
        return "a_1_1";
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
