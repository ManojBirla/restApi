package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("matrix")
public class MatrixParamResource {

	
	@GET
	@Path("/car1/{name}/{model}")
	public String getCar(@PathParam("name") String name,
			             @MatrixParam("color") String color,
			             @PathParam("model") String model
			            ){
		System.out.println("name of the car "+name);
		System.out.println("model of the car "+model);
		System.out.println("color of the car "+color);
		return "you  by the Bmw car";
	}
	
}
