package com.example.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

public class SpringwebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwebappApplication.class, args);
    }

}
