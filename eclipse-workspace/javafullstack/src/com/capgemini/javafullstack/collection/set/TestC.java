package com.capgemini.javafullstack.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Shalini");
		hs.add("Soumya");
		hs.add("Supriya");

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}
	}
}
