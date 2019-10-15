package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class ProjectionDemo {

	public static void main(String[] args) {



		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("empName"));
		plist.add(Projections.property("empSal"));
		crit.setProjection(plist);
		
		List<Object[]> lst = crit.list();
		
		sess.close();
		sfac.close();
		
		for(Object[] arr: lst) {
			System.out.println(arr[0] + " :::-> " + arr[1]);
		}
	}

}
