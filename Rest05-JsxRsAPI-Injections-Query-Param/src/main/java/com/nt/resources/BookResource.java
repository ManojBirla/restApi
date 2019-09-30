package com.nt.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("/book")
public class BookResource{
	
	
	@GET
        @Path("/q")
	public String getBookResource(@DefaultValue("ram") @QueryParam("name") String name,
			                      @DefaultValue("101") @QueryParam("id") int id) {
		System.out.println("Get Method");
		System.out.println("book name and name is "+name);
		return "book name is "+name+" and id is"+id;
	}
        
        @GET
        @Path("/b")
	public String getBookByIds(@Context UriInfo info) {
                MultivaluedMap<String, String> map=info.getQueryParameters();
                List<String> ids=map.get("id");
		System.out.println(ids);
		
		return "book name is ";
	}
}
