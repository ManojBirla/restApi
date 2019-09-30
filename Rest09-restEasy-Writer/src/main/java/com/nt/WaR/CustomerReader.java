package com.nt.WaR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.nt.bean.Customer;

@Provider
public class CustomerReader implements MessageBodyWriter<Customer>{

	@Override
	public long getSize(Customer t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	return 1;
	}
    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    	// TODO Auto-generated method stub
    	return true;
    }
    @Override
    public void writeTo(Customer c, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
    		MultivaluedMap<String, Object> httpHeaders, OutputStream os)
    		throws IOException, WebApplicationException {
    	
    	Writer writer=new PrintWriter(os);
    	writer.write(c.getCid());
    	writer.write(c.getCname());
    	writer.write(c.getCaddrs());
    	
    	writer.flush();
    	writer.close();
    	
    }
	

}
