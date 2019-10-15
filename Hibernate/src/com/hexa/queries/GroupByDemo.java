package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class GroupByDemo {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "select deptName, count(empId), max(empSal), min(empSal) from Emp group by deptName";
	    Query qry = sess.createQuery(hql);
	    List<Object[]> lst = qry.list();
	    sess.close();
	    sfac.close();
	    for(Object[] arr : lst) {
	    	System.out.println("--------------------------\n\n");
	    	System.out.println("Departname : " + arr[0]);
	    	System.out.println("Number of Employees : " + arr[1]);

	    	System.out.println("Maximum Salary : " + arr[2]);
	    	System.out.println("Minimum Salary : " + arr[3]);
	    	
	    }
		
	}

}
