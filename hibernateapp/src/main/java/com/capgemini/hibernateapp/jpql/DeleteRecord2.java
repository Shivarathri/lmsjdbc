package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteRecord2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String jpql = "delete from  Movie m where m.name = :mn and m.id = :mid";
		Query query = manager.createQuery(jpql);
		query.setParameter("mid", 3);
		query.setParameter("mn", "SAAHO");
		
		int m = query.executeUpdate();


		System.out.println("Record deleted---->"+m);

		transaction.commit();

		factory.close();
		manager.close();

	}

}
