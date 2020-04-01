package com.capgemini.javafullstack.collection.set;

import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add('A');
		ts.add(98);
		ts.add(2.3);
		ts.add("Seema");
		
		for(Object r : ts) {
			System.out.println(r);
		}

	}
}
