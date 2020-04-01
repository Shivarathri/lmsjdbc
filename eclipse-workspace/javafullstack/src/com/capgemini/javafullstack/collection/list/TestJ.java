package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(2.6);
		al.add(5.4);
		al.add(6.3);
		al.add(7.0);
		
		
		Iterator<Double> i = al.iterator();
		while(i.hasNext()) {
			Double b = i.next();
			System.out.println(b);
		}
		
		//Forward Direction
		
		ListIterator<Double> lt = al.listIterator();
		while(lt.hasNext()) {
			Double r = lt.next();
			System.out.println(r);
		}
		
		//Backward Direction
		
		ListIterator<Double> lit = al.listIterator(al.size());
		while(lit.hasPrevious()) {
			Double d =lit.previous();
			System.out.println(d);
		}
	}
}
