package com.achhecode.testing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class TestingApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
		log.info("Application 3 started");
		log.debug("Debugging start of the application");
	}
}
