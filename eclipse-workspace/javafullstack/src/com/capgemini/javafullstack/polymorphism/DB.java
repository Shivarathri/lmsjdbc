package com.capgemini.javafullstack.polymorphism;

public class DB {
	
	public void recieve(Person p) {
		
		String name = p.getName();
		int id = p.getId();
		double height = p.getHeight();
		
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
	}
}
