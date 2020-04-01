package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestO {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(44);
		v.add('V');
		v.add("AK");
		v.add(3.4);
		
		System.out.println("using for loop");
		for(int i =0;i<v.size();i++) {
			Object r = v.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(Object r : v) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator lt = v.iterator();
		while(lt.hasNext()) {
			Object r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator lit = v.listIterator();
		while(lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}
		
		System.out.println("<------ backward");
		while(lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}

	}
}
