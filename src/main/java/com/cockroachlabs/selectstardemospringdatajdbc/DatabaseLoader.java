package com.cockroachlabs.selectstardemospringdatajdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader {

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			repository.save(new Employee("Frodo Baggins", "ring bearer"));
			repository.save(new Employee("Bilbo Baggins", "burglar"));
			repository.save(new Employee("Samwise Gamgee", "gardener"));
		};
	}
}