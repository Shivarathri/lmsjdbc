package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicJPQL2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "update Movie m set m.name = :mn where m.id = :mid";
		Query query = manager.createQuery(jpql);
		query.setParameter("mid", 1);
		query.setParameter("mn", "RAVI");
		
		int m = query.executeUpdate();


		System.out.println("Record updated---->"+m);

		transaction.commit();

		factory.close();
		manager.close();

	}

}
