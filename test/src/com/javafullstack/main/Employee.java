package com.javafullstack.main;

public class Employee  implements Comparable<Employee> {
	String name;
	String phone;
	public Employee(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public int compareTo(Employee e) {
		return name.compareTo(e.name);
	}
	

}
