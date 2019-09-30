package com.nt.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nt.bean.StudentInfo;

@Path("/bean")
public class StudentBeanParam {
	public StudentBeanParam() {
		System.out.println("StudentBeanParam.StudentBeanParam()");
	}

	@POST
	@Path("b")
	public String getBeanParam(@BeanParam StudentInfo sInfo) {
		System.out.println(sInfo);
		return "success fully bean param is worked";
	}
}
