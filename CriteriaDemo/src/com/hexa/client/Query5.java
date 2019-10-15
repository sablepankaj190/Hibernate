package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;


//View employee who earns more than 30,000 and department = finance.

public class Query5 {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		Order order = Order.asc("empId");
		crit.addOrder(order);
		
		Criterion cond1 = Restrictions.ge("empSal", 30000.0);
		Criterion cond2 = Restrictions.eq("deptName", "Finance");
				
		LogicalExpression andExp = Restrictions.and(cond1, cond2);
		crit.add(andExp);
		
		List<Emp> lst = crit.list();
		
		sess.close();
		sfac.close();
		lst.forEach(System.out::println);

	}

}
