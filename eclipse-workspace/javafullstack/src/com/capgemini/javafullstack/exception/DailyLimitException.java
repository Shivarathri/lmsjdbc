package com.capgemini.javafullstack.exception;

public class DailyLimitException extends RuntimeException{
	
	String message = "Your daily limit is 10k";
	
	public DailyLimitException() {

	}

	public DailyLimitException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
