package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.beans.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/rest/")
@Api("this is welcome Controller")
public class RestControllerTest {

	public RestControllerTest() {
		System.out.println("RestControllerTest-constructor");
	}
	
	
	@GetMapping("/welcome")
	@ApiOperation("this is user method")
	@ApiResponse(response = String.class, code = 200, message = "String value")
	public String getRestController() {
		return "Welcome to Rest COntroller";
	}
	
	@GetMapping("/getBook")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBookData() {
		Book b=new Book();
		b.setId(101);
		b.setName("manoj");
		b.setPrice(4500);
	    
		System.out.println("RestControllerTest.getBookData()"+b);
		return Response.status(200).entity(b).build();
	}
	
	@PostMapping("/addBook")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addBook() {
		Book b=new Book();
		b.setId(101);
		b.setName("manoj");
		b.setPrice(4500);
	    
		System.out.println("RestControllerTest.addBookData()===book addes success fully");
		return "book addes success fully";
	}
}
