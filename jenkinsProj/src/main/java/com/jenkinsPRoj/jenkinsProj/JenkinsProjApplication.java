package com.jenkinsPRoj.jenkinsProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjApplication {
	
	@GetMapping("/")
	public String getHello() {
		return "Hello Akshat";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjApplication.class, args);
	}

}
