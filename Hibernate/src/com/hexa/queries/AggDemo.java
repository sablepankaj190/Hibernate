package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class AggDemo {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "select count(empId), sum(empSal), avg(empSal) from Emp";
	    Query qry = sess.createQuery(hql);
	    Object[] arr = (Object[]) qry.uniqueResult();
	    sess.close();
	    sfac.close();
	    	System.out.println("Number of Employees : " + arr[0]);
	    	System.out.println("Total Salary : " + arr[1]);
	    	System.out.println("Average Salary : " + arr[2]);
	    	
	    }
		
	}
