package com.capgemini.javafullstack.exception;

public class IRCTC {
	void confirm() {
		System.out.println("Confirm Started");

		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Exception Caught at confirm()");
			throw e;
		}
		finally {
			System.out.println("Confirm Ended");
		}
	}

}
