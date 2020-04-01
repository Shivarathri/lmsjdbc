package com.capgemini.librarymanagementjdbc.exception;

public class ValidationException extends RuntimeException {
	public ValidationException(String msg) {
		super(msg);
	}
}
