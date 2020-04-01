package com.capgemini.javafullstack.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestF {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("PineApple", 40);
		hm.put("Apple", 50);
		hm.put("Grapes", 90);
		hm.put("Banana", 10);
		
		Set<Entry<String, Integer>> ts = hm.entrySet();
		
		System.out.println();
		Iterator<Entry<String, Integer>> it = ts.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> e = it.next();
			String k = e.getKey();
			Integer v = e.getValue();
			System.out.println(k+"----->"+v);
		}
		
		System.out.println("using foreach");
		for(Entry<String , Integer > e : hm.entrySet()) {
			System.out.println(e);
		}
	}
}
