package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EsevaDTO implements Serializable
{
	private String name;
	private String addrs;
	private String bcNo;
	private String dob;

}
