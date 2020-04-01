package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('S');
		al.add(5.2);
		al.add("Shalini Mishra");
		
		Iterator it = al.iterator();
		Object i = it.next();
		Object j = it.next();
		Object k = it.next();
		Object l = it.next();
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
