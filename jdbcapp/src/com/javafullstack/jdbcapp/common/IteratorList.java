package com.javafullstack.jdbcapp.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}
}
