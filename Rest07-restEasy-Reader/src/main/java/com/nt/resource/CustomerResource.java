package com.nt.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.nt.bean.Customer;

@Path("/customer")
public class CustomerResource {
	Customer c=null;
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public String getCustomerReader(Customer c) {
		
		c.getCid();
		c.getCname();
		c.getCaddrs();
		
        
		System.out.println("c  is"+c.getCid()+" "+c.getCname()+" "+c.getCaddrs());
		return "success fully running"+c.getCid()+" "+c.getCname();
	}
	
	
}
