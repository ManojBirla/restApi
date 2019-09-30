package com.nt.resource;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bean.Customer;

@Path("/customer")
@Singleton
public class CustomerResource {
	
	public CustomerResource() {
		System.out.println("customer Resource constructor");
	}
	Customer c=null;
	
	@GET
	//@Consumes(MediaType.APPLICATION_JSON)
	public String getCustomerReader() {
		c=new Customer();
		c.setCid(5001);
		c.setCname("sandeep");
		c.setCaddrs("rameswaram");
		
		System.out.println("c  is"+c.getCid()+" "+c.getCname()+" "+c.getCaddrs());
		return " "+Response.ok(c).build();
	}
	
	
}
