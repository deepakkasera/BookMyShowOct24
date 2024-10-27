package com.example.bookmyshowoct24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowOct24Application {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowOct24Application.class, args);
    }

}
