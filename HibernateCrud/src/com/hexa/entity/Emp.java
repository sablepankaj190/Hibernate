package com.hexa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "hexa_employee")
public class Emp {

	@Id
	@Column(name = "emp_id")
	private int empId;
	

	@Column(name = "emp_name", length=25, nullable = false)
	private String empName;
	
	@Column(name = "emp_sal", nullable = false)
	private double empSal;
	
	@Column(name = "emp_dept", length=20, nullable = false)
	private String deptName;
	
	@Column(name = "emp_doj", length=25, nullable = false)
	private LocalDate doj;
	
	public Emp() {
		
	}
	
	public Emp(int empId, String empName, double empSal, String deptName, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.deptName = deptName;
		this.doj = doj;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empSal + " " + deptName + " " + doj;
	}
}
