package com.hexa.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hexa.entity.Emp;


public class EmpDaoImpl implements IEmpDao{

	

	@Override
	public int addEmployee(Emp emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(emp);
		tx.commit();
		em.close();
		return 1;
	}

	@Override
	public int editEmployee(Emp emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(emp);
		tx.commit();
		em.close();
		return 1;
	}

	@Override
	public Emp getEmployee(int eid) {
		EntityManager em = emf.createEntityManager();
		Emp emp = em.find(Emp.class, eid);
		em.close();
		return emp;
	}

	@Override
	public int removeEmployee(int eid) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Emp emp = em.find(Emp.class, eid);
		em.remove(emp);;
		tx.commit();
		em.close();
		return 1;
	}

	@Override
	public List<Emp> getEmployee() {
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("from Emp");
		List<Emp> lst = qry.getResultList();
		em.close();
		return lst;
	}

	@Override
	public List<Emp> getEmployee(String dept) {

		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("from Emp where deptName = ?");
		qry.setParameter(1, dept);
		List<Emp> lst = qry.getResultList();
		em.close();
		return lst;
	}
}
