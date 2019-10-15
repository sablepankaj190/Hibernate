package com.hexa.client;

import org.hibernate.SessionFactory;

import com.hexa.util.HibernateUtil;

public class AddEmployee {

	public static void main(String[] args) 
	{
		SessionFactory sfac = HibernateUtil.getSessionFactory();
		System.out.println("Table created successfully...");

	}

}
