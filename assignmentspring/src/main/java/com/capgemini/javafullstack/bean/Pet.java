package com.capgemini.javafullstack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {
	private String name;
	@Autowired
	@Qualifier("getCatSound")
	private Animal animal;
	
	public void Pet() {
		System.out.println("Default Construcor of Pet");
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void doSomthing() {
		
		System.out.println("The Animal Name is --->"+name);
		animal.sound();
	}
	
	
	
}
