package com.nt.exmapper;

import javax.net.ssl.SSLEngineResult.Status;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.nt.exception.ErrorMsg;
import com.nt.exception.TrainNotFoundException;
import com.nt.resource.CheckTrainPnr;

@Provider
public class MyExceptionMapper implements ExceptionMapper<TrainNotFoundException> {

	@Override
	public Response toResponse(TrainNotFoundException e) {
		ErrorMsg err=new ErrorMsg(400,e.getMessage());
		err.setRootCause("BAD_REQUEST");
		
		return Response.status(400)
				.entity(err)
				.type(MediaType.APPLICATION_XML)
				.build();
	}

	
}
