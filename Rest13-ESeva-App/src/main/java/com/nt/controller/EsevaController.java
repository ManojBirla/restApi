package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.EsevaCommand;
import com.nt.dto.EsevaDTO;
import com.nt.service.EsevaService;

@Controller
public class EsevaController {
	 
	@Autowired
	private EsevaService service;
    
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute ("cmd") EsevaCommand cmd) {
		
		return "esevaForm";
	}
	
	@RequestMapping(value="/add.htm",method=RequestMethod.POST)
	public String registerData(Map<String,Object> map,@ModelAttribute ("cmd") EsevaCommand cmd){
		EsevaDTO dto=null;
		String resultMsg=null;
		//ModelAndView mav=null;
		
		System.out.println(cmd);
		
		//invoke method
		dto=new EsevaDTO();
		BeanUtils.copyProperties(cmd, dto);
		System.out.println(dto);
		
		resultMsg=service.registerPInfo(dto);
		//mav=new ModelAndView();
		//add to mav object
		//mav.addObject("Msg",resultMsg);
		map.put("Msg", resultMsg);
		return "esevaForm";
	}
	

}
