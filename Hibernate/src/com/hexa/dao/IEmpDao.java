package com.hexa.dao;
import com.hexa.entity.Emp;
public interface IEmpDao {

	public String addEmployee(Emp emp);
	public Emp getEmployee(int eid);
	public String updateEmployee(int eid, double sal);
	public String deleteEmployee(int eid);
	public String updateEmployee(Emp emp);
}
