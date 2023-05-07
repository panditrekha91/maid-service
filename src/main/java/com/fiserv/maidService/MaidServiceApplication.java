package com.fiserv.maidService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaidServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaidServiceApplication.class, args);
		
		System.out.println("maid service project");
	}

}
