package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;



@Path("welcome")
public class MyFirstRestController {
	
	
	public MyFirstRestController() {
		System.out.println("MyFirstRestController-(constructor)");
	}
	
	@Path("welcomes")
	@GET()
	public String genrateWelcome() {
		System.out.println("Welcome to restful services now");
         
		return "Welcome to rest ful now";
	}
	
	@Path("greet")
	@GET
	public String genrateGreet() {
		System.out.println("Welcome to restful services");
         
		return "Good Morning";
	}
    

}
