package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('P');
		al.add(5.2);
		al.add("Shalini");
	
		
		for(Object o :al) {
			System.out.println(o);
		}
	}
}
