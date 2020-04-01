package com.capgemini.javafullstack.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.javafullstack.bean.Animal;
import com.capgemini.javafullstack.bean.Car;
import com.capgemini.javafullstack.bean.Cat;
import com.capgemini.javafullstack.bean.Hello;
import com.capgemini.javafullstack.bean.Lion;
import com.capgemini.javafullstack.bean.Pet;
@Configuration
public class AppConfig {
	@Bean
	public Car getCar() {
		Car car =new Car();
		car.setId(111);
		car.setName("aaaa");
		return car;
	}
	@Bean
	@Scope("prototype")
	public Hello getHello () {
		Hello hello = new Hello();
		hello.setId(10);
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("aaaaa");
		al.add("aaaaaaa");
		hello.setName(al);
		return hello;
	}
	@Bean
	
	public Lion getLion() {
		Lion animal = new Lion();
		//animal.sound();
		return animal;

	}

	@Bean
	@Primary
	public Cat getCat() {
		Cat cat = new Cat();
		//animal.sound();
		return cat;

	}

	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("aaaaaaaa");
		return pet;

	}



}
