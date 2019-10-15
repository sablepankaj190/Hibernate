package com.hexa.queries;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class BetweenDemo {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "from Emp where empSal between :minSal and :maxSal";
	    Query qry = sess.createQuery(hql);
	    qry.setParameter("minSal", 20000.0);
	    qry.setParameter("maxSal", 50000.0);
	    List<Emp> lst = qry.list();
	    sess.close();
	    sfac.close();
	    lst.forEach(System.out::println);

	}

}
