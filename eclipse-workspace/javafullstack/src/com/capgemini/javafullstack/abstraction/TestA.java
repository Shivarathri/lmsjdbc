package com.capgemini.javafullstack.abstraction;

public class TestA {
	public static void main(String[] args) {
		Browser b =new Browser();
		Gmail g = new Gmail();
		b.open(g);
		
		GDrive d = new GDrive();
		b.open(d);
	}
}
