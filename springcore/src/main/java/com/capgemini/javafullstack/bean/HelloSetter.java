package com.capgemini.javafullstack.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloSetter /* implements InitializingBean, DisposableBean */{
	private int id;
	private List<String> name;
	private CarSetters car;

	public HelloSetter() {
		System.out.println("Default constructor");
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public List<String> getName() {
		return name;
	}



	public void setName(List<String> name) {
		this.name = name;
	}



	public CarSetters getCar() {
		return car;
	}



	public void setCar(CarSetters car) {
		this.car = car;
	}



	public void print() {
		car.display();
		System.out.println("This is Hello ");
		System.out.println("Welcome to Spring core-----"+id);
		System.out.println("Welcome to Spring core-----"+name);
	}
	@PostConstruct
	public void init() throws Exception {       // using  init method
		System.out.println("Init method");
	}

	/*
	 * public void afterPropertiesSet() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("afterPropertiesSet");
	 * 
	 * }
	 */


	@PreDestroy
	public void destroy() throws Exception {      // using destroy method
		
		System.out.println("Destroy phase");
	}

}
