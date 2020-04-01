package com.capgemini.javabasics.constructors;

public class Testbike {

	public static void main(String[] args) {
		Father f = new Father();
		f.bike();
		System.out.println("====");
		Son s = new Son();
		s.bike();
	}

}
