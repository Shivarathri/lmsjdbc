package com.capgemini.javafullstack.polymorphism;

public class TestB {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1);
		p.setHeight(5.2);
		p.setName("Shalini");
		
		DB b = new DB();
		b.recieve(p);
	}
}
