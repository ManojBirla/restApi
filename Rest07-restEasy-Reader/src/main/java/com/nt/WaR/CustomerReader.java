package com.nt.WaR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.nt.bean.Customer;

@Provider
public class CustomerReader implements MessageBodyReader<Customer>{

	public CustomerReader() {
		System.out.println("Customer Reader");
		
	}
	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		
		return type==Customer.class;
	}

	@Override
	public Customer readFrom(Class<Customer> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
	InputStreamReader isr=new InputStreamReader(entityStream);
	BufferedReader br=new BufferedReader(isr);
	
	int cid=Integer.parseInt(br.readLine());
	String cname=br.readLine();
	String caddrs=br.readLine();
	System.out.println(cid);
	
	Customer c=new Customer();
	c.setCid(cid);
	c.setCname(cname);
	c.setCaddrs(caddrs);
	return c;
	}

}
