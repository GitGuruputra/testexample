package com.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Account")
public class Account {

	private int accId;
	private String accName;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	
}
