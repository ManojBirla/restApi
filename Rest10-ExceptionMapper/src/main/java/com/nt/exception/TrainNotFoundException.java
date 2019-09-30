package com.nt.exception;

public class TrainNotFoundException extends Exception {
	
	public TrainNotFoundException(String msg) {
	    super(msg);
        System.out.println("TrainNotFoundException.TrainNotFoundException()");

	}
	

}
