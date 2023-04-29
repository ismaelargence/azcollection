package net.zazacorp.azcollection;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AzcollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzcollectionApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello World";
	}
}
