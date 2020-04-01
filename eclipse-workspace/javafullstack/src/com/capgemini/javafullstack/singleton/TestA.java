package com.capgemini.javafullstack.singleton;

public class TestA {
	public static void main(String[] args) {
		Pen a = Pen.getPen();
		Pen b = Pen.getPen();
		
		System.out.println(a);
		System.out.println(b);
	}
}
