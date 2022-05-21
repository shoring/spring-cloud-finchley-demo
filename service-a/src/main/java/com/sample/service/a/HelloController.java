package com.sample.service.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @GetMapping("/hello")
    public String home(@RequestParam(value = "name") String name) {
        return "hello " + name + " ! I'm " + applicationName + "! I'm from " + instanceId;
    }
}
