package com.vijay.learn.SpringBootLearning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kumar Vijay
 */
@RestController
public class TestController {

    @Value("${welcome.message}")
    private String messageFromPropertiesFile;
    @GetMapping("/")
    public String test(){
        return messageFromPropertiesFile;
    }
}
