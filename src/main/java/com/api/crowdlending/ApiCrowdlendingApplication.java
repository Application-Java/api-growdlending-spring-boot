package com.api.crowdlending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiCrowdlendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCrowdlendingApplication.class, args);
	}
}
