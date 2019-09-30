package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.WebClientService;

@SpringBootApplication
@ComponentScan("com.nt.service,com.nt.controller")
public class Rest12SBookWebClientForSboot11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Rest12SBookWebClientForSboot11Application.class, args);
	    WebClientService service=ctx.getBean(WebClientService.class);
	    service.InvokeWelcomeMsg();
	}

}

