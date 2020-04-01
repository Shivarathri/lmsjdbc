package com.capgemini.javafullstack.lambda;

import java.util.function.Supplier;

public class TestG {
	public static void main(String[] args) {
		Supplier<Student> s =() -> new Student("Shalini");
		
		Student r = s.get();
		Student t = s.get();
		
		System.out.println(r);
		System.out.println(t);
		
	}
}
