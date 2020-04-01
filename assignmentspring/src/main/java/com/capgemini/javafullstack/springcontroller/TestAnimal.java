package com.capgemini.javafullstack.springcontroller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.Pet;

public class TestAnimal {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("animal.xml");
		Pet pet = context.getBean(Pet.class);
		pet.doSomthing();
	}
}
