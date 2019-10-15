package com.hexa.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name="vbean")
public class VoterBean implements Serializable{

	private String vname;
	private int age;
	private Date dt;
	private String res;
	
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		System.out.println("vname setter called");
		this.vname = vname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("vage setter called");
		this.age = age;
	}
	
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	//Action method --> business logic
	public void checkAge(ActionEvent ae){
		System.out.println("check age method....");
		if (age >= 18 && age <=50){
			this.res = "you are eligible to work";
		}else{
			this.res = "you are not eligible to work";
		}
		
	}
	
}





