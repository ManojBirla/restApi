package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.demo.service,com.example.demo.controller1"})
public class AppConfig {
    public AppConfig() {
	   System.out.println("AppConfig.AppConfig()");
    }
	
}
