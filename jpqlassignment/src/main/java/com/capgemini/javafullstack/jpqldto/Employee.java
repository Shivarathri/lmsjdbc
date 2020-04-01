package com.capgemini.javafullstack.jpqldto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
    @Id
	@Column
	private int id ;
	@Column
	private String name;
	@Column
	private String email;
	@Column(name="mobile_no")
	private long phone;
	@Column
	private double salary;
	@Column(name="deptno")
	private int deptid;
	@Column
	private String boodgroup;
	@Column
	private int age;
	@Column
	private String dob;
	
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	

}
