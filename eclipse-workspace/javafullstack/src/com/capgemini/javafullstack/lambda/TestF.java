package com.capgemini.javafullstack.lambda;

import java.util.function.Function;

public class TestF {
	public static void main(String[] args) {
		
		Function<String, Integer> f = (s) -> s.length();
		int res = f.apply("Shalini");
		System.out.println("result is "+res);
		
	}
}
