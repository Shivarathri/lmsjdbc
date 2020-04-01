package com.capgemini.javafullstack.exception;

public class InvalidAgeException extends Exception {
	private String message = "Sorry you are too young";
	
	public InvalidAgeException() {
		
	}

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
