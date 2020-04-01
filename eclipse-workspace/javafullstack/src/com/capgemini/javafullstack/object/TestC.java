package com.capgemini.javafullstack.object;

public class TestC {
	public static void main(String[] args) {
		Marker m = new Marker();
		m.cost = 40;
		m.name = "Camlin";
		
		Marker n = new Marker();
		n.cost = 40;
		n.name = "Camlin";
		
		//Comparing m object with n object
		
		System.out.println(m.equals(n));
	
		
	}
}
