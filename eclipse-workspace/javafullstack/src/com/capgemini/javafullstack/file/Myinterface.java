package com.capgemini.javafullstack.file;

public interface Myinterface {
	void myAbstract();
	public  static void myStaticMethod() {
		System.out.println("interface");
	}
	public default void myDefaultMethod() {
		System.out.println("default");
	}
}
