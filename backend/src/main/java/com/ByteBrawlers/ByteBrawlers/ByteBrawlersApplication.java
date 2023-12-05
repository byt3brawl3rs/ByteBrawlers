package com.ByteBrawlers.ByteBrawlers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ByteBrawlersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ByteBrawlersApplication.class, args);
    }

}
