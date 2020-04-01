package com.capgemini.javafullstack.bean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	private int id;
	private List<String> name; 
	//private Map<Integer,String> name;
	@Autowired
	private Car car;

	public Hello() {
		System.out.println("Default constructor");
	}

	/*
	 * public Hello(int id) { this.id=id; } public Hello(Map<Integer,String> name) {
	 * this.name=name; }
	 * 
	 * 
	 * Hello(int id, Map<Integer,String> name, Car car) { super(); this.id = id;
	 * this.name = name; this.car = car; }
	 */

	/*
	 * Hello(int id, List<String> name, Car car) { super(); this.id = id; this.name
	 * = name; this.car = car; }
	 */


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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void print() {
		car.display();
		System.out.println("Welcome to Spring core-----"+id);
		//System.out.println("Welcome to Spring core-----"+name);


		
		  for (String string : name) { System.out.println(string); }
		 


		/*
		 * for (Map.Entry<Integer, String> e : name.entrySet()) { //Integer i =
		 * e.getKey(); //String s=e.getValue(); System.out.println(e); }
		 */
	}



}
