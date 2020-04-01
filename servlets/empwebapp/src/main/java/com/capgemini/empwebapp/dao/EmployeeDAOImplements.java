package com.capgemini.empwebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import com.capgemini.empwebapp.dto.EmployeeBeen;

public class EmployeeDAOImplements implements EmployeeDAO {

	@Override
	public boolean register(EmployeeBeen bean) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
	    transaction.begin();
	    manager.persist(bean);
	    System.out.println("Record Register ");
	    transaction.commit();
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<EmployeeBeen> search(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from EmployeeBeen e where e.name =:name";
		TypedQuery<EmployeeBeen> query = manager.createQuery(jpql,EmployeeBeen.class);
		query.setParameter("name", name);
		return query.getResultList();
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBeen bean = manager.find(EmployeeBeen.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public EmployeeBeen auth(String email, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from EmployeeBeen e where e.email =:email and e.password=:password";
		TypedQuery<EmployeeBeen> query = manager.createQuery(jpql,EmployeeBeen.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
