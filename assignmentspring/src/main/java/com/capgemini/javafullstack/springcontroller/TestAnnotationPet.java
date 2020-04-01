package com.capgemini.javafullstack.springcontroller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.Pet;
import com.capgemini.javafullstack.congig.AnnotationPet;

public class TestAnnotationPet {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AnnotationPet.class);
		Pet pet = contex.getBean(Pet.class);
		pet.doSomthing();
		
		contex.close();
		
	}
}
