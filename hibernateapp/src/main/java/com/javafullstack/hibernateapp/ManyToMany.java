package com.javafullstack.hibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;
import com.capgemini.hibernate.manytomany.ProjectInfo;
import com.capgemini.hibernate.onetoone.Employee_Secondary_Info;

public class ManyToMany {
public static void main(String[] args) {
		

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		primary.setId(102);
		primary.setName("PASHI");
		primary.setOfficialemail("pashi@gmail.com");
		primary.setMobileno(987654321);
		primary.setDesignation("softeware developer");
		primary.setBlloodgroup("ab+ve");
		primary.setSalary(25000);
		primary.setDeptno(30);
		primary.setDoj("1998-01-18");
		primary.setManagerid(30);
		
		EmployeePrimaryInfo primary1 = new EmployeePrimaryInfo();
		primary1.setId(105);
		primary1.setName("RAVI");
		primary1.setOfficialemail("ravi@gmail.com");
		primary1.setMobileno(987654321);
		primary1.setDesignation("web developer");
		primary1.setBlloodgroup("b+ve");
		primary1.setSalary(45000);
		primary1.setDeptno(30);
		primary1.setDoj("1998-07-13");
		primary1.setManagerid(30);
	
		ArrayList<EmployeePrimaryInfo> list = new ArrayList<EmployeePrimaryInfo>();
		list.add(primary);
		list.add(primary1);
		
		
		ProjectInfo project = new ProjectInfo();
		project.setPid(106);
		project.setPname("IRCTC");
		project.setStartdate("2019-01-08");
		project.setEnddate("2019-04-23");
		project.setTechnology("java fullstack");
		project.setPrimary(list);
		
		ProjectInfo project1 = new ProjectInfo();
		project.setPid(107);
		project.setPname("IRCTC");
		project.setStartdate("2019-01-08");
		project.setEnddate("2019-04-23");
		project.setTechnology("java fullstack");
		project.setPrimary(list);
		
		
	
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(project);
			//manager.persist(secondaryInfo);
			//EmployeePrimaryInfo list = manager.find(EmployeePrimaryInfo.class, 20);
			//System.out.println(list.getSecondary().getFathername());
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
