package com.capgemini.javafullstack.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestL {
	public static void main(String[] args) {
		HashSet<Bottle> hs = new LinkedHashSet<Bottle>();
		
		Bottle b1 = new Bottle(1,"Water", 1.5);
		Bottle b2 = new Bottle(2, "Juice", 2.3);
		Bottle b3 = new Bottle(2, "Juice", 2.3);
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		Iterator<Bottle> it = hs.iterator();
		while(it.hasNext()) {
			Bottle b = it.next();
			System.out.println(b.id);
			System.out.println(b.name);
			System.out.println(b.capacity);
			System.out.println("--------------------------");
		}
	}
}
