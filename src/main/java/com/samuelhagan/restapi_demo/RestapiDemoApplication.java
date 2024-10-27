package com.samuelhagan.restapi_demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@SpringBootApplication
@ConfigurationPropertiesScan
public class RestapiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiDemoApplication.class, args);
	}

}

