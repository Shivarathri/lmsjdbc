package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestH {
	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add("Pavan");
		al.add('M');
		al.add(16);
		al.add(5.4);
		al.add(true);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object r= i.next();
			System.out.println(r);
		}
		
		ListIterator lt= al.listIterator(al.size());
		while(lt.hasPrevious()) {
			Object o= lt.previous();
			System.out.println(o);
		}
	}
}
