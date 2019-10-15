package com.hexa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("onroll")
public class Onroll extends Employee{

	private double pf;
	private double hra;
	
	public Onroll(){
		
	}

	public Onroll(int eid, String ename, double sal) {
		super(eid, ename, sal);
		this.pf = getSal() * 0.12;
		this.hra = getSal() * 0.3;
		setNetSal(getSal() + hra - pf); 
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	
	
	
}
