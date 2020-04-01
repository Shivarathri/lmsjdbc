package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(6);
		lhs.add(1);
		lhs.add(19);
		lhs.add(11);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println("----using for loop");
		for(Object r :lhs) {
			System.out.println(r);
		}
		
		System.out.println("using iterator");
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}
}
