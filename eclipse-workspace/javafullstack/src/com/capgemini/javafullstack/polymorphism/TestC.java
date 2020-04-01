package com.capgemini.javafullstack.polymorphism;

public class TestC {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Shalini");
		e.setEmail("shalini@gmail.com");
		e.setGender("female");
		e.setAge(22);
		e.setDesignation("Developer");
		e.setAddress("Hyd");
		e.setHeight(5.2);
		e.setSalary(22222);
		e.setPhone(123456789);
		DBEmployee d = new DBEmployee();
		d.recieve(e);
	}
}


