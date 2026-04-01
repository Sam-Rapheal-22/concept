package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping("/student")
class StudentController {

	@GetMapping("/greet")
	public String greetStudent() {
		return "Hello Student! Welcome to the system.";
	}


	@GetMapping("/greet/{name}")
	public String greetByName(@PathVariable String name) {
		return "Hello " + name + "! Welcome to the Student Greeting System.";
	}
}