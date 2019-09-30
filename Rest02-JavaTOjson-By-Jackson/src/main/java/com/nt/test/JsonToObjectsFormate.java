package com.nt.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonToObjectsFormate {

	
	public static void jsontoObject() throws Exception{
		CustomerData c=null;
		ObjectMapper mapper=null;
	    File file=null;
	    
	    file=new File("src/main/java/com/nt/files/Simple.json");
	    mapper=new ObjectMapper();
	    c=mapper.readValue(file,CustomerData.class);
	    System.out.println(c);
		
		
		
	}
	public static void jsontoObjects() throws Exception{
		CustomerData[] c=null;
		ObjectMapper mapper=null;
	    File file=null;
	    
	    file=new File("src/main/java/com/nt/files/SimpleMultipleData.json");
	    mapper=new ObjectMapper();
	    c=mapper.readValue(file,CustomerData[].class);
	    System.out.println(c);
	    for(CustomerData c1:c) {
	    	System.out.println(c1);
	    }
	}
	
	public static void main(String[] args) throws Exception {
		//jsontoObject();
		jsontoObjects();
		
	}


}
