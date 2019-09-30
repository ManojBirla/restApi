package com.nt.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJsonFormate {

	
	public static void javatojsonformate() throws Exception{
		
		ObjectMapper mapper=null;
		String result=null;
		CustomerData c=null;
		mapper=new ObjectMapper();
		c=new CustomerData(101,"Johny","johny@gmail.com",new Date());
		result=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(c);
		System.out.println(result);
	
	}
	public static void javastojsonformate() throws Exception{
		CustomerData c1=null,c2=null,c3=null;
		ObjectMapper mapper=null;
		List<Object> list=null;
		String result=null;
		
		
		list=new ArrayList();
		mapper=new ObjectMapper();
		c1=new CustomerData(101,"Johny","johny@gmail.com",new Date());
		c2=new CustomerData(102,"Smith","Smith@gmail.com",new Date());
		c3=new CustomerData(103,"George","George@gmail.com",new Date());
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		
		result=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		//mapper.prettyPrintingWriter(result);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		javatojsonformate();
		//javastojsonformate();
		
	}


}
