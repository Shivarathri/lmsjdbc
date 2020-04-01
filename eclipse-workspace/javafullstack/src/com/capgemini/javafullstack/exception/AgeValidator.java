package com.capgemini.javafullstack.exception;

public class AgeValidator {
	void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("You cannot enter the pub");
		}
	}
}
