package com.capgemini.hibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.hibernate.dto.Movie;

public class RetrievRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Movie m";
		
		//Query query = manager.createQuery(jpql);
		
		TypedQuery<Movie> query = manager.createQuery(jpql, Movie.class);
		List<Movie> record = query.getResultList();
		
		for (Movie movieInfo : record ) {
			
			System.out.println("ID---->"+movieInfo.getId());
			System.out.println("NAME---->"+movieInfo.getName());
			System.out.println("BUDGET---->"+movieInfo.getBudget());
			System.out.println(".......................................");
		}
		
		factory.close();
		manager.close();
	}

}
