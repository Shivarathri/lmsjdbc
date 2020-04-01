package com.capgemini.javafullstack.designpattern.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.javafullstack.designpattern.dto.Employee;

public class EmployeeDesignPatternJPAImplements implements EmployeeDAO {

	@Override
	public boolean updateEmployeeInfo(Employee info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "update Employee m set name = 'TEJA' where id =:mid";
		Query query = manager.createQuery(jpql);
		query.setParameter("mid", info.getId());
		int m = query.executeUpdate();


		System.out.println("Record updated----"+m);

		transaction.commit();

		factory.close();
		manager.close();


		return false;
		
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "delete from  Employee m where  m.id = :mid";
		Query query = manager.createQuery(jpql);
		query.setParameter("mid", id);
		
		
		int m = query.executeUpdate();

		
		System.out.println("Record deleted---->"+m);

		transaction.commit();

		factory.close();
		manager.close();
	return false;

	}

	@Override
	public boolean createEmployeeInfo(Employee info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "insert into Employee"
				+" values(:id,:name,:email,:phone,:salary,:deptno,:boodgroup,:age,:dob);";
		
		Query query = manager.createNativeQuery(jpql);
		query.setParameter("id",info.getId() );
		query.setParameter("name", info.getName());
		query.setParameter("email",info.getEmail());
		query.setParameter("phone",info.getPhone());
		query.setParameter("salary",info.getSalary());
		query.setParameter("deptno",info.getDeptid());
		query.setParameter("boodgroup",info.getBloodgroup());
		query.setParameter("age",info.getAge());
		query.setParameter("dob",info.getDob());
		
		int m = query.executeUpdate();
		
		System.out.println("Record inserted----"+m);

		transaction.commit();

		factory.close();
		manager.close();

		return false;
	}

	@Override
	public List<Employee> getALLInfo() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Employee m";
		
		//Query query = manager.createQuery(jpql);
		
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		List<Employee> record = query.getResultList();

		factory.close();
		manager.close();
		return record;
	}

	@Override
	public Employee getEmployeeDetails(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Employee m where id=:eid";
		
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		query.setParameter("eid", id);
		Employee emp = query.getSingleResult();

		factory.close();
		manager.close();
		
		return emp;
	}

}
