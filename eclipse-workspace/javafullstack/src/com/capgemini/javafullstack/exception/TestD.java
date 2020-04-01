package com.capgemini.javafullstack.exception;

public class TestD {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Paytm p = new Paytm();
		try {
		p.book();
		
		}catch(ArithmeticException e) {
			//System.out.println("Exception Caught at Main");
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
		
	}
}
