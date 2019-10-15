package com.hexa.client;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class DetatchDemo {

	public static void main(String[] args) {

       IEmpDao dao = new EmpDaoImpl();
       Emp emp = dao.getEmployee(1003);
       System.out.println(emp);
       emp.setEmpSal(23000);
       String res = dao.updateEmployee(emp);
       System.out.println("updated value is:"+ res);
       System.out.println(emp);
       HibernateUtil.getSessionFactory().close();
	}

}
