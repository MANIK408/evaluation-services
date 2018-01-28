package com.evaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Producer **/
@SpringBootApplication
// @EnableEurekaClient
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}