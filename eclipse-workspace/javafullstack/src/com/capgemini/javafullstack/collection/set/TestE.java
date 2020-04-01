package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestE {
	public static void main(String[] args) {
		LinkedHashSet<Double> lhs = new LinkedHashSet<Double>();
		lhs.add(11.4);
		lhs.add(6.6);
		lhs.add(19.9);
		lhs.add(3.1);
		
		System.out.println("----using for loop");
		for(Double r :lhs) {
			System.out.println(r);
		}
		
		System.out.println("using iterator");
		Iterator<Double> it = lhs.iterator();
		while(it.hasNext()) {
			Double r = it.next();
			System.out.println(r);
		}
		
		
	}
}
