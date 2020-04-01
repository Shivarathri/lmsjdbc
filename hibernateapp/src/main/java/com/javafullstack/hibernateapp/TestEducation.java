package com.javafullstack.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;
import com.capgemini.hibernate.onetomany.Employee_Educational_Info;
import com.capgemini.hibernate.onetomany.Employee_Educational_PK;

public class TestEducation {
public static void main(String[] args) {
		

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		primary.setId(107);
		primary.setName("M PRASHANTH");
		primary.setOfficialemail("prashanth@gmail.com");
		primary.setMobileno(987654321);
		primary.setDesignation("Software Developer");
		primary.setBlloodgroup("ab+");
		primary.setSalary(50000);
		primary.setDeptno(22);
		primary.setDoj("1997-09-08");
		primary.setManagerid(222);
		
		Employee_Educational_PK p = new Employee_Educational_PK();
		p.setId(107);
		p.setEducationtype("regular");
		
		Employee_Educational_Info pk = new Employee_Educational_Info();
		pk.setDegree("SSC");
		pk.setYop("2019");
		pk.setStream("CSE");
		pk.setClgname("GNITC");
		pk.setUniversityname("JNTUH");
		pk.setPercentage(68.19);
		pk.setPrimary(primary);
		
		
		
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			EmployeePrimaryInfo record = manager.find(EmployeePrimaryInfo.class, 107);
			
			pk.setPrimary(record);
			manager.persist(pk);
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
