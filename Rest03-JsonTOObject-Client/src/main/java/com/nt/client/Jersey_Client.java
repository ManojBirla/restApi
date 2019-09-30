package com.nt.client;

import javax.ws.rs.core.MediaType;

import com.nt.domain.Book;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Jersey_Client {

	public static void main(String[] args) {
		getByClient();
		System.out.println("=========");
		addBookByPost();
	}
	
	public static  void getByClient() {
		String restUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book";	
		Client client=Client.create();
		
		WebResource webRes=client.resource(restUrl);
		webRes.accept(MediaType.APPLICATION_JSON);
		
		ClientResponse response=webRes.get(ClientResponse.class);
		int status=response.getStatus();
		System.out.println(status);
		Book b=null;
		if(status==200) {
			b=response.getEntity(Book.class);
			System.out.println(b);
		}
		
	}//get
	
	public static void addBookByPost() {
		String restUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book";	
	    Client client=Client.create();
	    Book b=new Book();
	    WebResource webRes=client.resource(restUrl);
		webRes.accept(MediaType.APPLICATION_JSON);
		ClientResponse response=webRes.type(MediaType.APPLICATION_JSON)
				                      .post(ClientResponse.class,b);
		if(response.getStatus()==200) {
            String msg=response.getEntity(String.class);
            System.out.println(msg);
		}
	    
	}
	
	
	
}
