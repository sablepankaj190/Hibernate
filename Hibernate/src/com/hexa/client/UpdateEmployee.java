package com.hexa.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class UpdateEmployee {
	 SessionFactory sfac = HibernateUtil.getSessionFactory();
	public static void main(String[] args) {
	   
	    IEmpDao dao = new EmpDaoImpl();
		String emp = dao.updateEmployee(1003, 2);
		if(emp != null)
			System.out.println(emp);
		else {
			System.out.println("Data not found");
		}
		HibernateUtil.getSessionFactory().close();
	}

}
