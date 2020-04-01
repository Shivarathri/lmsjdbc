package com.capgemini.javafullstack.array;

public class TestB {
	public static void main(String[] args) {
		double[] a = new double[4];
		
		a[0] = 1.2;
		a[1] = 1.3;
		a[2] = 1.4;
		//a[3] = 1.5;
		
		a[2]= 1.9;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
