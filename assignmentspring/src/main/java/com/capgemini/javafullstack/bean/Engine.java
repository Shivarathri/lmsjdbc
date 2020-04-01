package com.capgemini.javafullstack.bean;

public class Engine {
	private int engno;
	private Car car;
	
	
	
	public Engine() {
		System.out.println("Default construcor of Engine");
	}

	

	public Engine(int engno, Car car) {
		super();
		this.engno = engno;
		this.car = car;
	}



	public int getEngno() {
		return engno;
	}



	public void setEngno(int engno) {
		this.engno = engno;
	}



	public Car getCar() {
		return car;
	}



	public void setCar(Car car) {
		this.car = car;
	}



	public void display() {
		car.show();
		System.out.println("the Engine no is -->"+engno);
	}
}
