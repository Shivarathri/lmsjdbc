package com.capgemini.javafullstack.exception;

public class TestI {
	public static void main(String[] args) {
		
		System.out.println("main started");
		BalanceValidation b = new BalanceValidation();
		b.verify(15000);
		
		System.out.println("main ended");
	}
}
