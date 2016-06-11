package com.temperature.screen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TemperatureScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureScreenApplication.class, args);
	}
}
