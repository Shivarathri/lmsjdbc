package com.capgemini.javabasics.constructors;

public class TestBus {
	public static void main(String[] args) {
		Bus s = new Bus(50, "cyan");
		s.getdetails();
		Bus b = new Bus();
		b.getdetails();
	}
}
