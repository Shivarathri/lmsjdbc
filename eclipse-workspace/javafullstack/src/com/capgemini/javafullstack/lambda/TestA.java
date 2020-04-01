package com.capgemini.javafullstack.lambda;

public class TestA {
	public static void main(String[] args) {
		MyCircle c = r -> 3.14 *r * r;
		double i = c.area(3);
		System.out.println(i);
	}
}
