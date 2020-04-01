package com.capgemini.javafullstack.bean;

public class Car {
	private int regno;
	private String name;
	
	public Car() {
		System.out.println("Default construcor of car");
	}
	
	
	
	public Car(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}



	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public void show() {
		System.out.println("Car reg no ---->"+regno);
		System.out.println("Car name is --->"+name);
	}

}
