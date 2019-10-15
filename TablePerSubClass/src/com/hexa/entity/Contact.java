package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="iqvia_contact")
public class Contact extends User{

	
	private String email;
	private int mobile;
	
	public Contact(){
		
	}
		
	public Contact(int uid, String uname, String email, int mobile) {
		super(uid, uname);
		this.email = email;
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
}
