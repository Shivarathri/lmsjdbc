package com.capgemini.javafullstack.hasa;

//MusicPlayer, Car

public class TestA {
	public static void main(String[] args) {
		Car c = new Car();
		c.model = 1947;
		c.m.cost = 1000;
		c.m.play();
		c.move();
		
		System.out.println(c.model);
		System.out.println(c.m.cost);
	}
}
