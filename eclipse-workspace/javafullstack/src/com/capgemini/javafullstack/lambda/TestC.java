package com.capgemini.javafullstack.lambda;

public class TestC {
	public static void main(String[] args) {
		MyInterest i = (p,t,r) -> (p*t*r)/100;
		double d = i.si(1000, 2, 3.1);
		System.out.println(d);
	}
}
