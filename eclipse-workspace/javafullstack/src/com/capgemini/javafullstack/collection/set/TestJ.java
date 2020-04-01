package com.capgemini.javafullstack.collection.set;

import java.util.TreeSet;

import java.util.Iterator;

public class TestJ {
	public static void main(String[] args) {
		TreeSet<Product> ts = new TreeSet<Product>();
		Product p1 = new Product(2, "Radio", 6000);
		Product p2 = new Product(11, "Bottle", 4000);
		Product p3 = new Product(6, "Projector", 9000);
		Product p4 = new Product(9, "Car", 8000);
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		Iterator<Product> it = ts.iterator();
		while(it.hasNext()) {
			Product r = it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.price);
			System.out.println("---------------");
		}
	}
}
