package com.nt.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nt.resource.CustomerResource;

@ApplicationPath("/api/")

public class MyApplicationConfig extends Application {
	
	public MyApplicationConfig() {
		System.out.println("MyApplicationConfig.MyApplicationConfig(0)");
	}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return super.getClasses();
	}
	
	@Override
	public Map<String, Object> getProperties() {
		
		Map<String, Object> map=new HashMap();
		map.put("jersey.config.server.provider.packages","com.nt.resource");
		return super.getProperties();
	}
}

