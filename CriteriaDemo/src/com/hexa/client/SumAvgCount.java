package com.hexa.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class SumAvgCount {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Criteria crit = sess.createCriteria(Emp.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.sum("empSal"));
		plist.add(Projections.count("empId"));
		plist.add(Projections.avg("empSal"));
		
		crit.setProjection(plist);
		
		List<Object[]> lst = crit.list();
		
		sess.close();
		sfac.close();
		
		for(Object[] arr: lst) {
			System.out.println("Total Salary : " + arr[0] + "\nNumber of Employees : " + arr[1] + "\nAverage Salary : " +arr[2]);
		}
		
	}

}
