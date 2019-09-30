package com.nt.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ck")
public class CookieParamResource {

	@GET
	
	public Response getCookies(@CookieParam("id") int id,
			                 @CookieParam("name") String name) {
		
		String res="query param recieved the id "+id+" and name is "+name;
		return Response.status(200).entity(res).build();
	} 
	
	
}
