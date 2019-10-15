package com.hexa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="iqvia_sinfo")
public class PersonalInfo extends Student{

	private String addr;
	private String email;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
