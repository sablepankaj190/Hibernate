package com.hexa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
 
		SessionFactory sfac = HibernateUtil.getSessionFactory();
		Session sess = sfac.openSession();
		
		sess.close();
		sfac.close();
	}

}
