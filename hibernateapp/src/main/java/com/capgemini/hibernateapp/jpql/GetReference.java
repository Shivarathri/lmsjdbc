package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.Movie;

public class GetReference {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		Movie record = manager.find(Movie.class, 1);
		//Movie record = manager.getReference(Movie.class, 1);
		
		//System.out.println("id--->"+record.getId());
		//System.out.println("name--->" +record.getName());
		//System.out.println("Budget--->"+record.getBudget());
		
		factory.close();
		manager.close();
		
	}

}
