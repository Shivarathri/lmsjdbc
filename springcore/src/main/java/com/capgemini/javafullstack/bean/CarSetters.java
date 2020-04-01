package com.capgemini.javafullstack.bean;

public class CarSetters {
	private int id;
	private String name;
	
	
	
	public CarSetters() {
		System.out.println("Default constructor");
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
	
	public void display() {
		
		System.out.println("This is CarSetters");
		System.out.println("ID is--->"+id);
		System.out.println("Name is--->"+name);
	}
}
