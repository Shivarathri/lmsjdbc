package com.capgemini.javafullstack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {
	private String name;
	@Autowired
	@Qualifier("getCat")
	private Animal animal;

	/*
	 * Pet(String name, Animal animal) { super(); this.name = name; this.animal =
	 * animal; }
	 * 
	 */

	

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



	public void doSomething() {
		System.out.println("Name of the animal--"+name);
		animal.sound();
	}

}
