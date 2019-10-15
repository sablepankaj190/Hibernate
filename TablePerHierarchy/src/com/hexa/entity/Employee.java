package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="iqvia_employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="etype")
public abstract class Employee {

	@Id
	private int eid;
	@Column(length = 20)
	private String ename;
	public double getNetSal() {
		return netSal;
	}


	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	private double sal;
	private double netSal;
	
	public Employee(){
		
	}
	
	
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
}






