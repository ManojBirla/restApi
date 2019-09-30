package com.nt.bean;

import javax.ws.rs.FormParam;

public class StudentInfo {
	@FormParam(value = "id")
	private int id;
	@FormParam(value = "name")
	private String name;
	@FormParam(value = "addrs")
	private String addrs;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
	
}
