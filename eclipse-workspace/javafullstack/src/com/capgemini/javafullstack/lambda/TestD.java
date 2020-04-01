package com.capgemini.javafullstack.lambda;

import java.util.function.Predicate;

public class TestD {
	public static void main(String[] args) {
		Predicate<Integer> p =(a) -> a%2==0;
		boolean res = p.test(11);
		System.out.println("Result is "+res);
		
		Predicate<Double> r = (a) -> a>=35.0;
		boolean ex = r.test(26.4);
		System.out.println("result is "+ex);
	}
}
