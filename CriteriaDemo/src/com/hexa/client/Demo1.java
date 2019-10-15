package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class Demo1 {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		Order order = Order.desc("empSal");
		crit.addOrder(order);
		List<Emp> lst = crit.list();
		
		
		sess.close();
		sfac.close();

		lst.forEach(System.out::println);
		
		
	}

}
