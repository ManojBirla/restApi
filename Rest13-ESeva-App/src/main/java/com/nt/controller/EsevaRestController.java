package com.nt.controller;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.EsevaDTO;
import com.nt.service.EsevaService;

@RestController
@RequestMapping("/eseva")
public class EsevaRestController {
	
	@Autowired
	private EsevaService service;
	
	/*@GetMapping("/giveBcNo")
	@Produces(MediaType.APPLICATION_JSON)
	public EsevaDTO giveToClient() {
	  String bcNo=null;
	  //bcNo=service.takeBirthCerNo(1);
	  EsevaDTO dto=service.takeBirthCerNo(2);
	  return dto;
	}*/
	
	@GetMapping("/giveBcNo/{id}")
	//@Produces(MediaType.APPLICATION_JSON)
	//@Path("{id}")
	public String giveToClient(@PathVariable("id") int id){
		  String bcno=null;
		  //bcNo=service.takeBirthCerNo(1);
		  EsevaDTO dto=service.takeBirthCerNo(id);
		  bcno=dto.getBcNo();
		  return bcno;
		  
	}
  
}
