package com.capgemini.javafullstack.hasa;

//Mobile, Student

public class TestB {
	public static void main(String[] args) {
		Student  s = new Student();
		s.id = 99;
		s.m.cost = 20000;
		s.m.game();
		s.mine();
		
		System.out.println(s.id);
		System.out.println(s.m.cost);
	}
}
