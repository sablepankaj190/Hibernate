package com.hexa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class GetvsLoad {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
        Session sess = sfac.openSession();
        Emp emp = sess.load(Emp.class, 2002);
        if(emp != null) {
        	System.out.println("---------------------------------------------");
        	System.out.println(emp.getEmpId());
        	System.out.println(emp.getEmpName());
        	System.out.println(emp.getEmpSal());
        } else {
        	System.out.println("Row not found.");
        }
        sess.close();
		sfac.close();
	}

}
