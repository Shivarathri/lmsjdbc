package com.capgemini.javafullstack.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.Animal;
import com.capgemini.javafullstack.bean.Cat;
import com.capgemini.javafullstack.bean.Lion;
import com.capgemini.javafullstack.bean.Pet;

public class TestAnimal {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


		/*
		 * Animal lion = context.getBean(Lion.class); lion.sound();
		 * 
		 * Animal cat = context.getBean(Cat.class); cat.sound();
		 */
		Animal animal = context.getBean(Animal.class);
		//animal.sound();
		
		Pet pet = context.getBean(Pet.class);
		pet.doSomething();
		context.close();
	}
}
