package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class SubqueryDemo {

	public static void main(String[] args) {

		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		DetachedCriteria subqry = DetachedCriteria.forClass(Emp.class);
		Projection p1 = Projections.max("empSal");
		subqry.setProjection(p1);
		
		
		
		
		Order order = Order.asc("empId");
	
		crit.addOrder(order);
		Criterion cond1 = Subqueries.propertyEq("empSal", subqry);
		crit.add(cond1);
		
		List<Emp> lst = crit.list();
		
		sess.close();
		sfac.close();
		lst.forEach(System.out::println);
		
	}

}
