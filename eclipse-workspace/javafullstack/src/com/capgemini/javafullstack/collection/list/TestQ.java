package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestQ {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Shalini");
		v.add("Soumya");
		v.add("Supriya");
		
		System.out.println("using for loop");
		for(int i =0;i<v.size();i++) {
			String r = v.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(String r : v) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator<String> lt = v.iterator();
		while(lt.hasNext()) {
			String r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator<String> lit = v.listIterator();
		while(lit.hasNext()) {
			String r = lit.next();
			System.out.println(r);
		}
		
		System.out.println("<------ backward");
		while(lit.hasPrevious()) {
			String r = lit.previous();
			System.out.println(r);
		}

	}
}
