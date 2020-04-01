package com.capgemini.javafullstack.polymorphism;

public class StudentArray {
	public void recieve(Student[] s) {
		for(Student g : s) {
			System.out.println("id is "+g.getId());
			System.out.println("Name is "+g.getName());
			System.out.println("Height is "+g.getHeight());
			System.out.println("****************************");
		}
	}
}
