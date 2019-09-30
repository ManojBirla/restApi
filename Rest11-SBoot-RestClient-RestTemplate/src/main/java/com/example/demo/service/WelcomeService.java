package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {
	
	
	public String getString1(){
		 String restUri="http://localhost:8080/Rest11-SBoot-RestClient/rest/welcome";
		// String msg=null;
		 //RestTemplate restTemplate = new RestTemplate();
		 //ResponseEntity<String> resEntity=restTemplate.getForEntity(restUri,String.class);
		 String uri = "http://localhost:8787/Rest11-SBoot-RestClient-Provider/rest/welcome";
	     
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri, String.class);
		     
		    System.out.println(result);
		/* if(null!=resEntity && resEntity.equals(HttpStatus.OK)) {
			 msg=resEntity.getBody();
		 }*/
		 return result;
	}
	
	public String getBook(){
		 String restUri="http://localhost:8787/Rest11-SBoot-RestClient-Provider/rest/getBook";
		 String msg=null;
		 RestTemplate restTemplate = new RestTemplate();
		 ResponseEntity<String> resEntity=restTemplate.getForEntity(restUri,String.class);
	       
		 //System.out.println(result);
		if(null!=resEntity && resEntity.equals(HttpStatus.OK)) {
			 msg=resEntity.getBody();
		 }
		 return msg;
	}
	
	public String addBook(){
		 String restUri="http://localhost:8787/Rest11-SBoot-RestClient-Provider/rest/addBook";
		 String msg=null;
		 RestTemplate restTemplate = new RestTemplate();
		 ResponseEntity<String> resEntity=restTemplate.getForEntity(restUri,String.class);
	     
		 //System.out.println(result);
		if(null!=resEntity && resEntity.equals(HttpStatus.OK)) {
			 msg=resEntity.getBody();
		 }
		System.out.println("add result"+msg);
		 return msg;
	}

}
