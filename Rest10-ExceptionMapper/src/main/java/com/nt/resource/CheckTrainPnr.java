package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.beans.TrainInfo;
import com.nt.exception.TrainNotFoundException;

@Path("/pnr")
public class CheckTrainPnr {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{pnr}")
	public TrainInfo getPnrStatus(@PathParam("pnr") String pnr) throws TrainNotFoundException {
		TrainInfo tinfo=new TrainInfo();
		tinfo.setPnrId(pnr);
		tinfo.setPassengerName("raja");
		tinfo.setAge(25);
		if(pnr.equalsIgnoreCase("ABC123")) {
			return  tinfo;
		}
		else {
			throw new TrainNotFoundException("wrong pnr you entered");
		}
		
	}

}
