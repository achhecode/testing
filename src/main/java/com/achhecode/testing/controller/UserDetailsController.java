package com.achhecode.testing.controller;

import com.achhecode.testing.entity.UserDetails;
import com.achhecode.testing.repository.UserDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-details")
public class UserDetailsController {

    @Autowired
    private UserDetailsRepository userDetailsRepository;
    
    @PostMapping("/add")
    public ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userDetails){
        UserDetails addedUser = userDetailsRepository.save(userDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
    }
}
