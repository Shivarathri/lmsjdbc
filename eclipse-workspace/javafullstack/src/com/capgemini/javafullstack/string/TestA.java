package com.capgemini.javafullstack.string;

public class TestA {
	public static void main(String[] args) {
		
		String k = "Hello World";
		String i = k.toUpperCase();
		String j = k.toLowerCase();
		
		System.out.println(i);
		System.out.println(j);
		
		String n = "Hi how are you";
		
		String[] ar = n.split(" ");
		for(String r : ar) {
			System.out.println(r);
		}
	}
}
