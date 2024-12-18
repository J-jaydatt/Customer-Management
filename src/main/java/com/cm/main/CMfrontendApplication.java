package com.cm.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan

@SpringBootApplication
public class CMfrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CMfrontendApplication.class, args);
	}

}
