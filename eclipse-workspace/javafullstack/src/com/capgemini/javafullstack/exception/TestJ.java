package com.capgemini.javafullstack.exception;

public class TestJ {
	public static void main(String[] args) {
		System.out.println("main started");
		
		AgeValidator a = new AgeValidator();
		try {
			a.validate(19);
			System.out.println("Welcome to pub");
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
