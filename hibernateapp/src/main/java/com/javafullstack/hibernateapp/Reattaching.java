package com.javafullstack.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Movie record = manager.find(Movie.class, 2);
			System.out.println(manager.contains(record));
			manager.detach(record);
			Movie reattach = manager.merge(record);
			System.out.println(manager.contains(reattach));
			reattach.setBudget(555);
			System.out.println("Record updated");
			transaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			transaction.rollback();						
		}
		
	}


}
