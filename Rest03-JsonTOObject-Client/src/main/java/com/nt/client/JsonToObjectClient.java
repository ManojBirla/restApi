package com.nt.client;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.nt.domain.Book;

public class JsonToObjectClient{
    public static void main(String[] args)throws Exception{
    	getRequestForBook();
    	postRequestForBook();
	  }//main
	public static void getRequestForBook() throws Exception {
		  String resUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book";
		  URL url=new URL(resUrl);
		  HttpURLConnection con=(HttpURLConnection)url.openConnection();
		  con.setRequestMethod("GET");
		  con.setRequestProperty("Content-Type", "application/json");
		 // con.setRequestProperty("Accept", "application/json");
		 
		  int statusCode=con.getResponseCode();
		  if(statusCode==200) {
			  InputStream is=con.getInputStream();
			  BufferedReader br=new BufferedReader(new InputStreamReader(is));
			  System.out.println(br.readLine());
			  String line=br.readLine();
			  while(line!=null) {
				  ObjectMapper mapper=new ObjectMapper();
				 
				  line=br.readLine();
				  Book b=mapper.readValue(line,Book.class);
				  System.out.println(line);
				  System.out.println(b);
				  System.out.println("===");
			  }
			  con.disconnect();
	     }//if
	}//get
	
	public static void postRequestForBook()throws Exception {
		  String resUrl="http://localhost:8080/Rest03-Jax-Rs-api-First/rest/book";
		  URL url=new URL(resUrl);
		  HttpURLConnection con=(HttpURLConnection)url.openConnection();
		  con.setRequestMethod("POST");
		  con.setRequestProperty("Content-Type", "application/json");
		  con.setRequestProperty("Accept", "application/json");
		  
		  Book b=new Book();
		  b.setId(789);
		  b.setName("paradoxial");
		  b.setAuthor("yatri");
		  b.setPrice(450);
		  
		  ObjectMapper mapper=new ObjectMapper();
		  String jsonData=mapper.writeValueAsString(b);
		  
		  con.setDoOutput(true);
		  
		  OutputStream os=con.getOutputStream();
		  os.write(jsonData.getBytes());
		  os.flush();
		  int status=con.getResponseCode();
		  System.out.println(status);
		  
		  if(status==200) {
			  
			  BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			  System.out.println(br.readLine());
			  String line=br.readLine();
			  while(line!=null) {
				  line=br.readLine();
				  System.out.println(line);
			  }
			  con.disconnect();
	     }//if
		  else {
			  System.out.println("something went wrong");
		  }
		  
	}
}//class
