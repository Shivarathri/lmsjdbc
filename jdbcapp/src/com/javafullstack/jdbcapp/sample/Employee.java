package com.javafullstack.jdbcapp.sample;

import java.util.Date;

public class Employee {
	private int id ;
	private String name;
	private String email;
	private long phone;
	private double salary;
	private int deptid;
	private String boodgroup;
	private int age;
	private Date dob;
	
	public Employee() {
		
	}
	public Employee(int id, String name, String email, long phone, double salary, int deptid, String boodgroup, int age,
			Date dob) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.deptid = deptid;
		this.boodgroup = boodgroup;
		this.age = age;
		this.dob = dob;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getBoodgroup() {
		return boodgroup;
	}
	public void setBoodgroup(String boodgroup) {
		this.boodgroup = boodgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	

}
