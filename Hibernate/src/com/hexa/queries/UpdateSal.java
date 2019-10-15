package com.hexa.queries;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class UpdateSal {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
        
        String hql = "update Emp set empSal = ? where empId = ?";
	    Query qry = sess.createQuery(hql);
        qry.setParameter(0, 45000.0);
        qry.setParameter(1, 1001);
        int rows = qry.executeUpdate();
        sess.close();
	    sfac.close();
	    System.out.println("Number of rows updated : " + rows);
	    }
		
	}

