package com.capgemini.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.hibernate.dto.Movie;

public class SingleRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Movie m where id=1";
		TypedQuery<Movie> query = manager.createQuery(jpql, Movie.class);
		Movie record = query.getSingleResult();



		System.out.println("ID---->"+record.getId());
		System.out.println("NAME---->"+record.getName());
		System.out.println("BUDGET---->"+record.getBudget());
		System.out.println(".......................................");

		factory.close();
		manager.close();

	}

}
