package com.javafullstack.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;
import com.capgemini.hibernate.onetomany.Employee_Address_Info;
import com.capgemini.hibernate.onetomany.Employee_Address_PK;
import com.capgemini.hibernate.onetoone.Employee_Secondary_Info;

public class TestManyToOne {
public static void main(String[] args) {
		

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		primary.setId(100);
		primary.setName("bbb");
		primary.setOfficialemail("bbb@gmail.com");
		primary.setMobileno(987654321);
		primary.setDesignation("tester");
		primary.setBlloodgroup("b-");
		primary.setSalary(20000);
		primary.setDeptno(20);
		primary.setDoj("1997-09-08");
		primary.setManagerid(111);
		
		Employee_Address_PK p = new Employee_Address_PK();
		p.setId(100);
		p.setAddrsstype("father_in_law");
		
		Employee_Address_Info pk = new Employee_Address_Info();
		pk.setAddresspk(p);
		pk.setHouseno("6-39/B");
		pk.setAddress1("SATHENPALLY*");
		pk.setAddress2("abcd");
		pk.setLandmark("BASAVANGUDI");
		pk.setCity("guntur");
		pk.setState("andhra pradhesh");
		pk.setPincode(503165);
		pk.setPrimary(primary);
		
		
		
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			EmployeePrimaryInfo record = manager.find(EmployeePrimaryInfo.class, 100);
			System.out.println(record.getPk().get(0).getPrimary().getId());
			System.out.println(record.getPk().get(0).getPrimary().getPk());
			//pk.setPrimary(record);
			//manager.persist(pk);
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
