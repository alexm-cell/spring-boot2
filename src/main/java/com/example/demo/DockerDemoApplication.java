package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @RestController
    public static class DockerDemoController {

        @GetMapping("/")
        public String home() {
            return "Hello, World!";
        }

        @GetMapping("/hello")
        public String hello() {
            return "Hello from /hello!";
        }
    }
}
