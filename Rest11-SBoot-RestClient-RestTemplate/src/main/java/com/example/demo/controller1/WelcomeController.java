package com.example.demo.controller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	
	@RequestMapping(value = "/print")
	public @ResponseBody String getMsgFromProvide(){
		
		return service.getString1();
	}
	
	@RequestMapping(value = "/getBook")
	public @ResponseBody String getbookData(){
		
		return service.getBook();
	}
	
	@RequestMapping(value = "/addBook")
	public @ResponseBody String addbookData(){
		
		return service.addBook();
	}
	
}
