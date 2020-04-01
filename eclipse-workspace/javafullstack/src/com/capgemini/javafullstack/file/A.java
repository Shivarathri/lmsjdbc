package com.capgemini.javafullstack.file;

public interface A {
	public default void abc() {
		System.out.println("a calss abc  method");
	}

	static void xyz() {
		System.out.println("a calss xyz  method");
	}

}
