package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Pavan");
		al.add('M');
		al.add(16);
		al.add(5.4);
		al.add(true);
		
		for(Object r: al) {
			System.out.println(r);
		}
	}
}
