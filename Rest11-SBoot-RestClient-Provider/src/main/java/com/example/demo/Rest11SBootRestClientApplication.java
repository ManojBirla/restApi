package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.cofig.RootConfig;
import com.nt.cofig.SwaggerConfig;

import io.swagger.models.Swagger;

@SpringBootApplication
@Import({RootConfig.class,SwaggerConfig.class})
public class Rest11SBootRestClientApplication {

	public Rest11SBootRestClientApplication() {
		System.out.println("Rest11SBootRestClientApplication(0-param)");
	}
	public static void main(String[] args) {
		SpringApplication.run(Rest11SBootRestClientApplication.class, args);
	}

}
