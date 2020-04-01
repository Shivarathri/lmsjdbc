package com.capgemini.javafullstack.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.javafullstack.bean.Hello;
import com.capgemini.javafullstack.bean.Pet;
import com.capgemini.javafullstack.config.AppConfig;

public class TestAnnotationBased {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
		
		  Hello h = contex.getBean(Hello.class); Hello h1 =
		  contex.getBean(Hello.class); h.print(); System.out.println(h==h1);
		 
		
		/*
		 * Pet pet = contex.getBean(Pet.class); pet.doSomething(); contex.close();
		 */
	}
}
