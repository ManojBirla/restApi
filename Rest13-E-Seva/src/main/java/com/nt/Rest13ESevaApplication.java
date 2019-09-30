package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.nt.config.copy.RootConfig;

@SpringBootApplication
//@Import(RootConfig.class)
public class Rest13ESevaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rest13ESevaApplication.class, args);
	}

}
