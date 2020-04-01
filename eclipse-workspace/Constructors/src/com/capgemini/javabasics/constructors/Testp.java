package com.capgemini.javabasics.constructors;

public class Testp {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println(a);

		Parentclass p = new Parentclass();
		System.out.println("========  ");

		Childclass c = new Childclass();
	}
}
