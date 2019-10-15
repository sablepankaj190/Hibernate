package com.hexa.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexa.entity.Emp;
import com.hexa.util.HibernateUtil;

public class EmpDaoImpl implements IEmpDao {

	private SessionFactory sfac = HibernateUtil.getSessionFactory();
	
	@Override
	public String addEmployee(Emp emp) {
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			sess.save(emp);
			tx.commit();
		} catch (HibernateException ex) {
		
			tx.rollback();
			return "Not Added";
		}
		return "Employee Added";
	}

	@Override
	public Emp getEmployee(int eid) {
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
	    Emp emp = sess.get(Emp.class, eid);
		sess.close();
		return emp;
	}

	@Override
	public String updateEmployee(int eid, double sal) {
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			Emp emp = sess.get(Emp.class, eid);
			emp.setEmpSal(sal);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			return "Not updated";
		}
		return "Employee updated";
	}
 
	@Override
	public String deleteEmployee(int eid) {
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			Emp emp = sess.get(Emp.class, eid);
	        sess.delete(emp);
	        tx.commit();
		} catch (HibernateException e) {
			
		}
		return "Employee deleted";
	}

	@Override
	public String updateEmployee(Emp emp) {
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			sess.saveOrUpdate(emp);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			return "Not updated";
		}
		return "Employee updated";
	}
}
