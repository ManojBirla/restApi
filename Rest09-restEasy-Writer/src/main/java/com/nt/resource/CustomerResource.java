package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bean.Customer;

@Path("/customer")
public class CustomerResource {
	Customer c=null;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCustomerReader() {
		c=new Customer();
		c.setCid(123);
		c.setCname("gautam rahul ka bhai");
		c.setCaddrs("hyd");
		
        
		//System.out.println("c  is"+c.getCid()+" "+c.getCname()+" "+c.getCaddrs());
		return Response.ok(c.toString()).build();
	}
	
	
}
