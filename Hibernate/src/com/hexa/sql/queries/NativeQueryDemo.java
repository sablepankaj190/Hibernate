package com.hexa.sql.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class NativeQueryDemo {

	public static void main(String[] args) {
		
		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		
		String sql = "select emp_id, emp_name, emp_sal from hexa_employee";
		Query qry = sess.createSQLQuery(sql);
		List<Object[]> lst = qry.list();
		
		
		
		sess.close();
		sfac.close();

		for(Object[] arr:lst) {
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		}
	}

}
