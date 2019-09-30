package com.nt.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import com.nt.domain.Book;

public class RestEasy_Client {

	
	public static void main(String[] args)throws Exception {
		getRequestForClient();
		postRequestForClient();
	}
	public static void getRequestForClient()throws Exception {
		String resUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book";
		ClientRequest request = new ClientRequest(resUrl);
		request.accept("application/json");
		//ClientResponse<String> response = request.get(String.class);
		ClientResponse<String> response = request.get(String.class);
		System.out.println(response.getStatus());
		if(response.getStatus()==200) {
			//Book is=response.getEntity();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new ByteArrayInputStream( response.getEntity().getBytes())));
				String output ;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

		}
	}//get
	public static void postRequestForClient()throws Exception {
		String resUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book/newRes";
		ClientRequest request = new ClientRequest(resUrl);
		
		
		
		String input = "{\"id\":101,\"name\":\"Paradoxical Pm\",\"author\":\"Mr Tharoor}";
			request.body("application/json", input);
				
			ClientResponse<String> response = request.post(String.class);
            System.out.println(response.getStatus());
			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(response.getEntity().getBytes())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		
	}
}
