package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('P');
		al.add(3.9);
		al.add("Shalini");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		
		
	}
}
