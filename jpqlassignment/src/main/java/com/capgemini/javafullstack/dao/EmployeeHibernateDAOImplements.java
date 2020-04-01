package com.capgemini.javafullstack.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.javafullstack.jpqldto.Employee;

public class EmployeeHibernateDAOImplements implements EmployeeDAO {

	@Override
	public boolean updateEmployeeInfo(Employee emp) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "update Employee m set name = 'BAHUBALI*' where id =:mid";
		Query query = manager.createQuery(jpql);
		query.setParameter("mid", emp.getId());
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
		query.setParameter("boodgroup",info.getBoodgroup());
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
		
		for (Employee emp : record ) {
			
			System.out.println("ID---->"+emp.getId());
			System.out.println("NAME---->"+emp.getName());
			System.out.println("EMAIL---->"+emp.getEmail());
			System.out.println("PHONE---->"+emp.getPhone());
			System.out.println("SALARY---->"+emp.getSalary());
			System.out.println("DEPTNO---->"+emp.getDeptid());
			System.out.println("BOODGROUP---->"+emp.getBoodgroup());
			System.out.println("AGE---->"+emp.getAge());
			System.out.println("DOB---->"+emp.getDob());
			
			System.out.println(".......................................");
		}
		
		factory.close();
		manager.close();
		return null;
	}

	@Override
	public Employee getEmployeeDetails(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Employee m where id=1";
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		Employee emp = query.getSingleResult();



		System.out.println("ID---->"+emp.getId());
		System.out.println("NAME---->"+emp.getName());
		System.out.println("EMAIL---->"+emp.getEmail());
		System.out.println("PHONE---->"+emp.getPhone());
		System.out.println("SALARY---->"+emp.getSalary());
		System.out.println("DEPTNO---->"+emp.getDeptid());
		System.out.println("BOODGROUP---->"+emp.getBoodgroup());
		System.out.println("AGE---->"+emp.getAge());
		System.out.println("DOB---->"+emp.getDob());
		

		factory.close();
		manager.close();
		return null;
	}

}
