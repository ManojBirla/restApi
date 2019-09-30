package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EsevaBO;
import com.nt.dao.EsevaDAO;
import com.nt.dto.EsevaDTO;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service("service")
public class EsevaServiceImpl implements EsevaService {
	
	@Autowired
	private EsevaDAO dao;
	
	@Override
	public String registerPInfo(EsevaDTO dto) {
		int result=0;
		EsevaBO bo=null;
		
	    bo=new EsevaBO();
	    BeanUtils.copyProperties(dto, bo);
		result=dao.insertPDetails(bo);
		if(result==0) {
			return "registration failed";
		}
		else {
			return "registration successfully done";
		}
	}
}
