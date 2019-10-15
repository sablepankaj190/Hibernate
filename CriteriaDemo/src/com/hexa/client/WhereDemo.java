package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class WhereDemo {

	public static void main(String[] args) {



		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		Order order = Order.asc("empId");
		crit.addOrder(order);
		
		Criterion cond1 = Restrictions.eq("deptName", "Finance");
		crit.add(cond1);
		List<Emp> lst = crit.list();
		
		sess.close();
		sfac.close();

		lst.forEach(System.out::println);
	}

}
