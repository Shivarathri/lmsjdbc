package com.capgemini.javafullstack.bean;

public class Car {
	private int id;
	private String name;
	
	/*
	 * public Car(int id, String name) { super(); this.id = id; this.name = name;
	 * 
	 * }
	 */
	
	
	public void display() {
		System.out.println("ID is--->"+id);
		System.out.println("Name is--->"+name);
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
	
	

}
