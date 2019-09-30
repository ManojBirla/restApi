package com.nt.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nt.beans.TrainInfo;
import com.nt.exception.ErrorMsg;
import com.nt.exception.TrainNotFoundException;
import com.nt.exmapper.MyExceptionMapper;
import com.nt.resource.CheckTrainPnr;

@ApplicationPath("/api/*")
public class AppConfig extends Application{
	
	public AppConfig() {
		System.out.println("AppConfig-0-Param-Constructor"); 
	}
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<Object>();
		singletons.add(new CheckTrainPnr());
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(TrainInfo.class);
		classes.add(TrainNotFoundException.class);
		classes.add(MyExceptionMapper.class);
		classes.add(ErrorMsg.class);
		return classes;
	}

}
