package com.capgemini.javafullstack.polymorphism;

public class Train {
	void  search(int a) {
		System.out.println("Searching by number "+a);
	}
	
	void search(String name) {
		System.out.println("Searching by name "+name);
	}
}
