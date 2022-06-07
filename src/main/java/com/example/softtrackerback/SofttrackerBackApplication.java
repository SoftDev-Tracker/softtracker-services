package com.example.softtrackerback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SofttrackerBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofttrackerBackApplication.class, args);
    }

}
