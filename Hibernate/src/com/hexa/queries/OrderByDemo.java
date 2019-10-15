package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class OrderByDemo {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
	    String hql = "from Emp order by empSal desc";
	    Query qry = sess.createQuery(hql);
	    qry.setFirstResult(2);
	    qry.setMaxResults(2);
	    List<Emp> lst = qry.list();
	    sess.close();
	    sfac.close();
	    lst.forEach(System.out::println);
	}

}
