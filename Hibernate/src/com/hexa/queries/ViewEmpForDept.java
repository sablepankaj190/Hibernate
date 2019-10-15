package com.hexa.queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class ViewEmpForDept {

	public static void main(String[] args) {


		Scanner sc =  new Scanner(System.in);
		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        String dept = sc.nextLine();
	    dept = "'" + dept + "'";
        String hql = "from Emp where deptName="+ dept +"order by empId";
	    Query qry = sess.createQuery(hql);
	    List<Emp> lst = qry.list();
	    sess.close();
	    sfac.close();
	    lst.forEach(System.out::println);
	}

}
