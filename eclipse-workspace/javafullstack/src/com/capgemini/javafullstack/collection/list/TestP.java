package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestP {
	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('A');
		v.add('E');
		v.add('I');
		v.add('O');
		v.add('U');
		
		System.out.println("using for loop");
		for(int i =0;i<v.size();i++) {
			Character r = v.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(Character r : v) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator<Character> lt = v.iterator();
		while(lt.hasNext()) {
			Character r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator<Character> lit = v.listIterator();
		while(lit.hasNext()) {
			Character r = lit.next();
			System.out.println(r);
		}
		
		System.out.println("<------ backward");
		while(lit.hasPrevious()) {
			Character r = lit.previous();
			System.out.println(r);
		}

	}
}
