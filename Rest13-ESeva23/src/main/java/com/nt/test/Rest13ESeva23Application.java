package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.cofig.RootConfig;
import com.nt.cofig.SwaggerConfig;


@SpringBootApplication
@Import({RootConfig.class,SwaggerConfig.class})
public class Rest13ESeva23Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest13ESeva23Application.class, args);
	}

}
