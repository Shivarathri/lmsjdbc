package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestL {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shalini");
		al.add("Soumya");
		al.add("supriya");
		
		System.out.println("using for loop");
		for(int i =0;i<al.size();i++) {
			String r = al.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******using for-each loop");
		for(String r : al) {
			System.out.println(r);
		}
		
		System.out.println("****Iterator");
		Iterator<String> lt = al.iterator();
		while(lt.hasNext()) {
			String r = lt.next();
			System.out.println(r);
		}
		
		System.out.println("*********ListIterator");
		System.out.println("-----------> forward");
		ListIterator<String> lit = al.listIterator();
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
