package com.javafullstack.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;
import com.capgemini.hibernate.dto.Movie;
import com.capgemini.hibernate.onetoone.Employee_Secondary_Info;

public class TestOneToOne {
	public static void main(String[] args) {
		

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		primary.setId(20);
		primary.setName("AAA");
		primary.setOfficialemail("aaa@gmail.com");
		primary.setMobileno(987654321);
		primary.setDesignation("java developer");
		primary.setBlloodgroup("b-");
		primary.setSalary(20000);
		primary.setDeptno(20);
		primary.setDoj("1998-09-08");
		primary.setManagerid(30);
		
		Employee_Secondary_Info secondaryInfo = new Employee_Secondary_Info();
		
		secondaryInfo.setAge(20);
		secondaryInfo.setGender("male");
		secondaryInfo.setDob("1999-02-11");
		secondaryInfo.setPersonalemail("abc@gmail.com");
		secondaryInfo.setFathername("PRASHANTH");
		secondaryInfo.setMothername("XYZ");
		secondaryInfo.setMarriedstatus("married");
		secondaryInfo.setNationality("indian");
		secondaryInfo.setGovtid("PAN1234");
		secondaryInfo.setPrimary(primary);
		primary.setSecondary(secondaryInfo);
		
		
	
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			//manager.persist(secondaryInfo);
			EmployeePrimaryInfo list = manager.find(EmployeePrimaryInfo.class, 20);
			System.out.println(list.getSecondary().getFathername());
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		factory.close();
	}

}
