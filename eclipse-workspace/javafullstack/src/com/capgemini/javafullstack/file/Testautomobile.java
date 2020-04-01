package com.capgemini.javafullstack.file;

public class Testautomobile {
	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.gear();
		b.gps();
		b.abs();
		System.out.println(Automobile.left);
		System.out.println(Automobile.right);

		Toyato t = new Toyato();
		t.gear();
		t.gps();
		
		Audi a = new Audi();
		a.gear();
		a.gps();
		a.abs();
	}
}
