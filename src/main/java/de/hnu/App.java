package de.hnu;

import org.springframework.boot.SpringApplication;                      // Spring Boot entry point
import org.springframework.boot.autoconfigure.SpringBootApplication;    // Spring Boot auto configuration using dependency injection, Manage Tomcat server, etc.

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}