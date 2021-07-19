package com.gis.gas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasApplication.class, args);
	}

}
