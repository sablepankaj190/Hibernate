package com.hexa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class Contract extends Employee{

	private int days;
	
	private Contract(){
		
	}

	public Contract(int eid, String ename, double sal, int days) {
		super(eid, ename, sal);
		this.days = days;
		setNetSal(getSal() * days);
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	
}
