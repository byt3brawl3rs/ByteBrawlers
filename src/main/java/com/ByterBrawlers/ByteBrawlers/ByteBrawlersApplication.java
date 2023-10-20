package com.ByterBrawlers.ByteBrawlers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ByteBrawlersApplication {

	public static void main(String[] args) {
		// Create Spring Boot application
		ConfigurableApplicationContext application = SpringApplication.run(ByteBrawlersApplication.class, args);

		// For debugging purposes.
		// Will run the server until you stop the application on your machine.
		while (application != null) {

		}

		// Create exit code that is defaulted to 0.
		int exitCode = SpringApplication.exit(application, () -> 0);

		// Close the application using the exit code.
		System.exit(exitCode);
	}

}
