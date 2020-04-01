package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestI {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(2.6);
		al.add(5.4);
		al.add(6.3);
		al.add(7.0);
		
		for(int i =0; i<al.size(); i++) {
			Double b =al.get(i);
			System.out.println(b);
		}
		
		for(Double r : al) {
			System.out.println(r);
		}
	}
}
