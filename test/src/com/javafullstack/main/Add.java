package com.javafullstack.main;

import com.javafullstack.calculator.Addition;

public class Add {

	public static void main(String[] args) {
		Addition a = new Addition();
		int r = a.add(3, 4);
		System.out.println("result..."+r);

	}

}
