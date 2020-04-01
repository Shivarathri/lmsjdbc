package com.capgemini.javafullstack.collection.set;

import java.util.TreeSet;

import java.util.Iterator;

public class TestI {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Mahesh");
		ts.add("Shalini");
		ts.add("Sai Soumya");
		ts.add("supriya");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}
}
