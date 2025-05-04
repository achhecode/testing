package com.achhecode.testing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class RestMainController {


    @GetMapping("/test")
    public String test(){
        log.info("Test api called");
        return "testing worked!";
    }
}
