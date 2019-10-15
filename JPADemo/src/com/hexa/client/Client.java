package com.hexa.client;

import java.time.LocalDate;
import java.util.List;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;

public class Client {

	public static void main(String[] args) {
		IEmpDao dao = new EmpDaoImpl();
	     Emp emp = new Emp(1010, "Anubhav", 47000, "Production", LocalDate.of(2016, 6, 10));
		dao.addEmployee(emp);
		List<Emp> lst = dao.getEmployee();
		
		lst.forEach(System.out::println);

		IEmpDao.emf.close();
		
	}

}
