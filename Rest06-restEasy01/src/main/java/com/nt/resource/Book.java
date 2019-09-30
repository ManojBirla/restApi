package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/welcome")
public class Book {
	
	public Book() {
		System.out.println("Book.Book()");
	}
	
	@GET
	@Path("/ja")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessageFromRest()throws Exception {
		
		String res="Welcome to the restEasy";
		System.out.println(res);
		return Response.ok(res).build();
		
	}

}
