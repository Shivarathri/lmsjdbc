package com.capgemini.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.springrest.beans.EmployeeResponce;
import com.capgemini.springrest.exceptions.EmployeeException;

@RestControllerAdvice
public class MyRestControllerAdvice {
	@ExceptionHandler
	public EmployeeResponce myExceptionHandler(EmployeeException empException) {
		EmployeeResponce response = new EmployeeResponce();
		response.setError(true);
		response.setMessage(empException.getMessage());
		return response;
	}
}
