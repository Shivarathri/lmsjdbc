package com.capgemini.javafullstack.polymorphism;

public class DBEmployee {
	
	 public void recieve(Employee e) {
		 
	 System.out.println("Id is"+ e.getId());
	 System.out.println("Name is "+e.getName());
	 System.out.println("Height is "+e.getHeight());
	 System.out.println("salary is "+e.getSalary());
	 System.out.println("designation is "+e.getDesignation());
	 System.out.println("age is "+e.getAge());
	 System.out.println("Email is "+e.getEmail());
	 System.out.println("phone is"+e.getPhone());
	 System.out.println("Gender is "+e.getGender());
	 System.out.println("address is "+e.getAddress());
	 }
}
