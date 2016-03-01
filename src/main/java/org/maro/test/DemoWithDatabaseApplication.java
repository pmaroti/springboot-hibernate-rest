package org.maro.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWithDatabaseApplication.class, args);
	}
}
