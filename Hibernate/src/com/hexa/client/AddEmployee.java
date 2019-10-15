package com.hexa.client;

import java.time.LocalDate;

import org.hibernate.SessionFactory;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class AddEmployee {

	public static void main(String[] args) 
	{
	
		IEmpDao dao = new EmpDaoImpl();
		Emp emp = new Emp(1009, "Anurag", 43000, "ATM", LocalDate.of(2016, 6, 10));
		String res = dao.addEmployee(emp);
		System.out.println(res);
		HibernateUtil.getSessionFactory().close();
	}	

}
