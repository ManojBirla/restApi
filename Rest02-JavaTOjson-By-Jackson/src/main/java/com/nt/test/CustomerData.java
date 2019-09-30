package com.nt.test;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonPropertyOrder({"customerId","customerEmail","customerName"})
public class CustomerData implements Serializable{

    @JsonProperty("cust-id")	
	private int customerId;
    
    @JsonProperty("cust-name")
    //@JsonIgnore
	private String customerName;
    
    @JsonProperty("cust-email")
	private String customerEmail;
	
    @JsonSerialize(using = DateSerializer.class)
   // @JsonSerialize(using = DateParseSerializer.class)
    private Date dob;
    
	public CustomerData() {
	
	}

	public CustomerData(int customerId, String customerName, String customerEmail, Date dob) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.dob = dob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "CustomerData [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", dob=" + dob + "]";
	}
}
