package com.hexa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexa.entity.Contract;
import com.hexa.entity.Onroll;
import com.hexa.util.HibernateUtil;

public class AddEmployee {

	public static void main(String[] args) {


		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		
		Contract emp1 = new Contract(1001, "Pankaj", 35000, 10);
		Onroll emp2 = new Onroll(1002, "Shivam", 45000.0);
		sess.save(emp1);
		sess.save(emp2);
		tx.commit();
		
		sess.close();
		sfac.close();
		System.out.println("Table created.");
		
	}

}
