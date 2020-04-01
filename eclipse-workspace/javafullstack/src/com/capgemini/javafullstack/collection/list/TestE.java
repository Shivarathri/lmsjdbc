package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('S');
		al.add(5.2);
		al.add("Shalini Mishra");
		
		ListIterator lt = al.listIterator();
		
		System.out.println("----------> Forward");
		while(lt.hasNext()) {
			Object r = lt.next();
			System.out.println(r);
			
		}
		
		System.out.println("<--------- Backward");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}
}
