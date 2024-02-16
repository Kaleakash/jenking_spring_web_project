package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithJenkingSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJenkingSampleAppApplication.class, args);
		System.out.println("spring boot up on port number 9090");
	}

}
