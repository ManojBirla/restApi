package com.nt.test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializable;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class DateSerializer extends JsonSerializer<Date> {

	
	@Override
	public void serialize(Date date, JsonGenerator jgen,
			              SerializerProvider provider)
			throws IOException, JsonProcessingException {
		SimpleDateFormat sdf=null;
		CustomerData c=new CustomerData();
	
		sdf=new SimpleDateFormat("dd-MMM-yyyy");
		String value=sdf.format(date);
		jgen.writeString(value);
	}
	
}
