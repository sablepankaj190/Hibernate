package com.hexa.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="tbean")
@ViewScoped
public class TaxBean {

	private String ename;
	private double income;
	private Double tax;
	
	
	public TaxBean() {
		System.out.println("tax bean constructor invoked");
	}
	
	public String getEname() {
		System.out.println("ename getter");
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("ename setter");
		this.ename = ename;
	}
	public double getIncome() {
		System.out.println("income getter");
		return income;
	}
	public void setIncome(double income) {
		System.out.println("income setter");
		this.income = income;
	}
	public Double getTax() {
		System.out.println("tax getter");
		
		return tax;
	}
	public void setTax(double tax) {
		System.out.println("tax setter");
		this.tax = tax;
	}
	
	public void calcTax(ActionEvent ae) {
		if(income > 1000000)
			this.tax = 750000 * 0.1 +(income-1000000)* 0.15;
		else if(income > 250000)
			this.tax = (income - 250000)* 0.1;
		
	}

	
	
}
