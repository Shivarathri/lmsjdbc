package com.capgemini.javafullstack.object;

public class TestD {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Remote r = new Remote();
		r.cost = 100;
		r.name = "SamSung";
		
		Remote t = (Remote)r.clone();
		
		System.out.println("Cost is "+t.cost);
		System.out.println("Name is "+t.name);
		
	}
}
