package com.achhecode.testing.controller;

import com.achhecode.testing.entity.UserDetails;
import com.achhecode.testing.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class RestMainController {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PutMapping("/insert-user")
    public String insertUser(){
        // inserting user
        return "";
    }

    // due to postman issue writing in get api later it must be moved into put/post api
    @GetMapping("/get-user")
    public String getUser(){
        // inserting user - temporary code
        UserDetails user1 = new UserDetails("ardanish2", "A R", "1234", LocalDate.of(1999, 1, 1), "New Delhi, India");
        userDetailsRepository.save(user1);

        // returning the inserted user details
        return userDetailsRepository.findByUsername(user1.getUsername()).toString();
    }
}