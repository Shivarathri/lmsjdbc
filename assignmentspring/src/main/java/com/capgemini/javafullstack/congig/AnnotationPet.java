package com.capgemini.javafullstack.congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.javafullstack.bean.Cat;
import com.capgemini.javafullstack.bean.Dog;
import com.capgemini.javafullstack.bean.Pet;
@Configuration
public class AnnotationPet {
	@Bean
	public Dog getDogSound() {
		Dog d = new Dog();
		return d;
		
	}
	
	@Bean
	public Cat getCatSound() {
		Cat c = new Cat();
		return c;
		
	}
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("aaaaaaaaaaaa");
		return pet;

	}
}
