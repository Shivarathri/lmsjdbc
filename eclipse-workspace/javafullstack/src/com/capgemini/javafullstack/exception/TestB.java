package com.capgemini.javafullstack.exception;

public class TestB {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		int a[] = new int[4];
		
		try {
			a[10] = 9;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("dont cross boundary");
			//a[1] = 5;
		}
		
		/*for(int i = 0; i<4; i++) {
			System.out.println(a[i]);
		}*/
		
		System.out.println("main ended");
	}
}
