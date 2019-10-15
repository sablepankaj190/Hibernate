package com.hexa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="iqvia_user")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {

	@Id
	private int userid;
	private String uname;
	
	public User(){
		
	}
	
	public User(int uid, String uname) {
		super();
		this.userid = uid;
		this.uname = uname;
	}



	public int getUserid() {
		return userid;
	}
	public void setUserid(int uid) {
		this.userid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
}







