package com.hexa.queries;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class WhereDemo {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        String hql = "from Emp where deptName = ?";
       
	    Query qry = sess.createQuery(hql);
	    qry.setParameter(0, "Developer");
	    List<Emp> lst = qry.list();
	    sess.close();
	    sfac.close();
	    lst.forEach(System.out::println);
	}

}
