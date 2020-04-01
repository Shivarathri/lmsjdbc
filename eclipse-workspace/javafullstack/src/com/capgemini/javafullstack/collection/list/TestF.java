package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('S');
		al.add(5.2);
		al.add("Shalini Mishra");
		
		ListIterator lt = al.listIterator(al.size());
		
		//Index starts from the last position
		
		System.out.println("<---------Backward");
		while(lt.hasPrevious()) {
			Object r = lt.previous();
			System.out.println(r);
		}
	}
}
