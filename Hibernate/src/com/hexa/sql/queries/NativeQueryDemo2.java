package com.hexa.sql.queries;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class NativeQueryDemo2 {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		
		String sql = "select * from hexa_employee";
		SQLQuery qry = sess.createSQLQuery(sql);
		System.out.println(qry.getClass().getSimpleName());
		
		qry.addEntity(Emp.class);
		List<Emp> lst = qry.list();
		
		
		
		sess.close();
		sfac.close();

		lst.forEach(System.out::println);
	}

}
