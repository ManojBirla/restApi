package com.nt.cofig;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.nt.controller")
public class RootConfig {

	public RootConfig() {
		System.out.println("RootConfig(-)-construct");
	}
}
