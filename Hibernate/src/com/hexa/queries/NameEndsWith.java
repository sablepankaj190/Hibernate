package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class NameEndsWith {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "from Emp where empName like :lname";
	    Query qry = sess.createQuery(hql);
	    qry.setParameter("lname", "%kumar");
	    List<Emp> lst = qry.list();
	    sess.close();
	    sfac.close();
	    lst.forEach(System.out::println);
	}

}
