package com.routing.camelrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CamelroutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelroutingApplication.class, args);
	}
}
