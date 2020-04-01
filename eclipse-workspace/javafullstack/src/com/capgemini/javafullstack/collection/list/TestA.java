package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(6);
		al.add('P');
		al.add(5.2);
		al.add("Shalini");
		
		
		for(int i = 0; i<al.size();i++) {
			Object r = al.get(i);
			System.out.println(r);
		}
	}
}
