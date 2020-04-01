package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestN {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Shalini");
		li.add("Soumya");
		li.add("Supriya");
		
		System.out.println("using for loop");
		for(int i =0;i<li.size();i++) {
			Object r = li.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(Object r : li) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator lt = li.iterator();
		while(lt.hasNext()) {
			Object r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator lit = li.listIterator();
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
