package com.capgemini.javafullstack.lambda;

public class TestB {
	public static void main(String[] args) {
		BMI b = (h,w) -> w/(h*h);
		double d = b.calculate(5.2,47);
		System.out.println(d);
	}
}
