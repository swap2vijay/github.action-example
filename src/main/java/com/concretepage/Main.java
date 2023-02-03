package com.concretepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	@GetMapping("/welcome")
	public String welcome(){

		return "Welcome to Myworld";
	}
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}

// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/swap2vijay/github.action-example.git
// git push -u origin main