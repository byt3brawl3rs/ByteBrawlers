package com.ByteBrawlers.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ByteBrawlersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByteBrawlersApplication.class, args);
	}

}
