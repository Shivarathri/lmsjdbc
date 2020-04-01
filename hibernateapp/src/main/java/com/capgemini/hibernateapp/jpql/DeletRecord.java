package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeletRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "delete from Movie m  where m.id = 2";
		Query query = manager.createQuery(jpql);
		int m = query.executeUpdate();


		System.out.println("Record deleted----"+m);

		transaction.commit();

		factory.close();
		manager.close();

	}

}
