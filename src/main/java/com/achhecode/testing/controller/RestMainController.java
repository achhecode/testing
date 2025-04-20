package com.achhecode.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class RestMainController {
    @GetMapping("/test")
    public String test(){
        return "testing worked!!!";
    }
}
