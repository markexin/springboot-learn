package com.springlearn.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringLearnApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}
}
