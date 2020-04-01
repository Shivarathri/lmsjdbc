package com.capgemini.javafullstack.hasa;

//Pen, Singer

public class TestC {
	public static void main(String[] args) {
		Singer s = new Singer();
		s.age = 22;
		Singer.p.cost = 10;
		Singer.p.draw();
		s.sing();
		
		System.out.println(s.age);
		System.out.println(Singer.p.cost);
	}
}
