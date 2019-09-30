package com.nt.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.sun.research.ws.wadl.Application;

@Path("/book")
public class BookResource{
	
	@GET
	@Path("{isbn}/{name}")
	public String getBookResource(@PathParam("isbn") String isbn,
			                     @PathParam("name") String name) {
		System.out.println("Get Method");
		System.out.println("book name "+isbn+" and name is "+name);
		return "price is 450$";
	}
	
	
	
	
	

	

}
