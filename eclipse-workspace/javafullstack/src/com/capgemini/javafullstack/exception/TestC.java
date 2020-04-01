package com.capgemini.javafullstack.exception;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Cow c = null;
		
		try {
			c.eat();
		}
		catch(ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		
		catch(NullPointerException a) {
			System.out.println("dont deal with null");
		}
		
		System.out.println("Main Ended");
	}
}
