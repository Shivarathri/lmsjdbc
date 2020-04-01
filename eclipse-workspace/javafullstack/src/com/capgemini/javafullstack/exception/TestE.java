package com.capgemini.javafullstack.exception;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		String s = null;
		int ar[] = new int[3];
		
		try {
			ar [9] = 100;
			s.toUpperCase();
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		System.out.println("Main Ended");
	}
}
