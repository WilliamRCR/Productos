package com.umg.umg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
public class UmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmgApplication.class, args);
	}

	@GetMapping("/hello")
	public String Hello(@RequestParam String name){
		return String.format("Hello %s!", name);
	}

}
