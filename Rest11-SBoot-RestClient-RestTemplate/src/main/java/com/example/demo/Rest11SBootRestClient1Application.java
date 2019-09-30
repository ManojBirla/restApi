package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.demo.service.WelcomeService;

@SpringBootApplication
@Import(AppConfig.class)
public class Rest11SBootRestClient1Application {

	public Rest11SBootRestClient1Application() {
		System.out.println("restBoot11");
	}
	public static void main(String[] args){
		ConfigurableApplicationContext ctx = SpringApplication.run(Rest11SBootRestClient1Application.class, args);
	    WelcomeService ws=ctx.getBean(WelcomeService.class);
	    String msg=ws.getString1();
	    System.out.println("hello");
	    System.out.println("msg "+msg);
	    
		//SpringApplication.run(Rest11SBootRestClient1Application.class, args);
	}

}
