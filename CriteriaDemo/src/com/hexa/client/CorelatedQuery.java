package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class CorelatedQuery {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria outerCrit = sess.createCriteria(Emp.class, "e1");
		DetachedCriteria subqry = DetachedCriteria.forClass(Emp.class, "e2");
		Projection p1 = Projections.max("empSal");
		subqry.setProjection(p1);
		
		
		Order order = Order.asc("empId");
	
		outerCrit.addOrder(order);
		Criterion sbqryCond = Restrictions.eqProperty("e2.deptName", "e1.deptName");
		subqry.add(sbqryCond);
		
		Criterion cond1 = Subqueries.propertyEq("empSal", subqry);
		
		outerCrit.add(cond1);
		
		List<Emp> lst = outerCrit.list();
		
		sess.close();
		sfac.close();
		lst.forEach(System.out::println);
		
	}

}
