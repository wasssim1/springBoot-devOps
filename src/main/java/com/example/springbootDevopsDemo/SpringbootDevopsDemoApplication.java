package com.example.springbootDevopsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDevopsDemoApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to SpringBoot devOps Demo home page.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevopsDemoApplication.class, args);
	}

}
