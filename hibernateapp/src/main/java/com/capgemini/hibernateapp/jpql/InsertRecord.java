package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "insert into Movie values (:id,:name, :budget)";
		
		
				
		
		Query query = manager.createNativeQuery(jpql);
		query.setParameter("id",2 );
		query.setParameter("name", "AAA");
		query.setParameter("budget", 123);
		
		int m = query.executeUpdate();
		
		System.out.println("Record inserted----"+m);

		transaction.commit();

		factory.close();
		manager.close();

	}
	

}
