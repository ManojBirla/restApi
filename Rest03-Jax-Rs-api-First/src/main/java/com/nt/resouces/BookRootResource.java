package com.nt.resouces;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.domain.Book;

@Path("/book")
public class BookRootResource {

	public BookRootResource() {
		System.out.println("0-param constructor(Book Resource)");
	}
	
	@POST
	@Consumes(
			{MediaType.APPLICATION_JSON,
		     MediaType.APPLICATION_XML 
			})
	public String addBook(Book B) {
		System.out.println("add book method"+B);
		System.out.println("new Books success fully added");
		//return Response.ok(200).entity(B).build();
		return "Successfull added";
	}
	@POST
	@Consumes(
			{MediaType.APPLICATION_JSON,
		     MediaType.APPLICATION_XML 
			})
	@Path("/newRes")
	public Response createProductInJSON(Book book) {

		String result = "Product created : " + book;
		return Response.status(201).entity(result).build();
		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,
		       MediaType.APPLICATION_XML 
		      })
	public Book getBooks() {
		System.out.println("BookRootResource.getBooks(Method)");
		Book b=new Book();
		b.setId(101);
		b.setName("Paradoxical Pm");
		b.setAuthor("Mr Tharoor");
		b.setPrice(450.00f);
		return b;
		
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON,
		       MediaType.APPLICATION_XML 
		      })
	public Book upadteBooks() {
		System.out.println("BookRootResource.upadteBooks((Method)");
		Book b=new Book();
		b.setId(102);
		b.setName("the Hindu Pm");
		b.setAuthor("Tharoor ");
		b.setPrice(550.00f);
		return b;
		
	}
	
	@DELETE
	public String deleteBooks() {
		System.out.println("BookRootResource.upadteBooks((Method)");
		
		System.out.println("delete is successfully");
		return "delete is successfully";
	}
}
