package com.capgemini.javafullstack.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.javafullstack.bean.Pet;
import com.capgemini.javafullstack.config.AppConfig;

public class TestAnnotPet {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Pet pet = contex.getBean(Pet.class);
		pet.doSomething();
		contex.close();
	}

}
