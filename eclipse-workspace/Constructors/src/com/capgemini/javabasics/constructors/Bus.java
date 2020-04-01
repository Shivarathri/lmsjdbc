package com.capgemini.javabasics.constructors;

public class Bus {
	int seats;
	String color;

	Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;

	}

	Bus(int seats) {
		this(seats, "red");

	}

	Bus() {
		this(40);
	}

	void getdetails() {
		System.out.println(color);
   	}

}
