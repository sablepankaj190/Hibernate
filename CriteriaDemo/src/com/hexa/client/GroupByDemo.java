package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class GroupByDemo {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.max("empSal"));
		plist.add(Projections.min("empSal"));
		plist.add(Projections.avg("empSal"));
		plist.add(Projections.groupProperty("deptName"));
		
		crit.setProjection(plist);
		
		List<Object[]> lst = crit.list();
		
		sess.close();
		sfac.close();
		
		for(Object[] arr: lst) {
			System.out.println("-----------------------------------");
			System.out.println("Maximum Salary : " + arr[0] + "\nMinimum Salary : " + arr[1] + "\nAverage Salary : " +arr[2]);
		    System.out.println("Department Name : " + arr[3]);
		}
		
	}

}
