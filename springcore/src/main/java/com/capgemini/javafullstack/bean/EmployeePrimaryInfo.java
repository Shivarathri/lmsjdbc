package com.capgemini.javafullstack.bean;

public class EmployeePrimaryInfo {
	private int id;
	private String name;
	private EmployeeAddressInfo address;

	public EmployeePrimaryInfo() {
		System.out.println("Defalt constructor");
	}


	public EmployeePrimaryInfo(int id, String name, EmployeeAddressInfo address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void print() {
		System.out.println("Id---"+id+"Name----"+name);
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


	public EmployeeAddressInfo getAddress() {
		return address;
	}


	public void setAddress(EmployeeAddressInfo address) {
		this.address = address;
	}

	
	
	 


}
