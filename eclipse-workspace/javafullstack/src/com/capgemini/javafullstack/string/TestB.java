package com.capgemini.javafullstack.string;

public class TestB {
	public static void main(String[] args) {
		Student s = new Student("Shalini", 22);
		System.out.println(s.getName());
		
		System.out.println(s.getAge());
		
		Student m = new Student("Soumya", 21);
		System.out.println(m.getName());
		
		System.out.println(m.getAge());
	}
}
