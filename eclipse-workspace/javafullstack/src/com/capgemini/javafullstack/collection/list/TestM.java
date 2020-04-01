package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(3.4);
		li.add(5);
		li.add("Shalini");
		li.add('P');
		
		System.out.println("*******using for loop******");
		for(int i=0;i<li.size();i++) {
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
