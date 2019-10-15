package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class ProjectionDemo {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "select empName, empSal from Emp";
	    Query qry = sess.createQuery(hql);
	    List<Object[]> lst = qry.list();
	    sess.close();
	    sfac.close();
	    for(Object[] arr : lst) {
	    	System.out.println(arr[0] + " " + arr[1]);
	    }
	    	
	}

}
