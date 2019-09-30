package com.nt.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nt.bean.StudentInfo;

@Path("/form")
public class StudentFormParam {
   
	StudentInfo info=new StudentInfo();
	public StudentFormParam() {
		System.out.println("StudentFormParam.StudentFormParam()");
	}
	
	@POST
	public String getFormParam(@FormParam("id") int id,
			                   @FormParam("name") String name,
			                   @FormParam("addrs") String addrs) {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("addrs "+addrs);
		
		return "get form values success fully";
	}
}
