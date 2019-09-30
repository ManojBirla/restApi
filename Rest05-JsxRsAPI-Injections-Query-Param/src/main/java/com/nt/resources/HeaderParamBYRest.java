package com.nt.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/header")
public class HeaderParamBYRest {
	public HeaderParamBYRest() {
		System.out.println("HeaderParam.HeaderParam()");
	}
	
	@GET
	@Path("/by")
	public String getheader(@HeaderParam("user-agent") String userAgent) {
		return "header success fully executed::"+userAgent;
	}
	
	@GET
	@Path("/get")
	public String addUser(@Context HttpHeaders headers) {

		String userAgent = headers.getRequestHeader("user-agent").get(1);
		
		System.out.println(userAgent);
		return  userAgent;

	}

}
