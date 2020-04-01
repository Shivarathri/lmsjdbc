package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestK {
	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('A');
		al.add('E');
		al.add('I');
		al.add('O');
		al.add('U');
		
		System.out.println("using for loop");
		for(int i =0;i<al.size();i++) {
			Object r = al.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(Object r : al) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator lt = al.iterator();
		while(lt.hasNext()) {
			Object r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator lit = al.listIterator();
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
