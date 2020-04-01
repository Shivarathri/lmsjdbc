package com.capgemini.javafullstack.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestW {
	public static void main(String[] args) {
		LinkedList<Person> li = new LinkedList<Person>();
		Person p1 = new Person(5, "Ramesh", 5.1);
		Person p2 = new Person(1, "Manju", 5.9);
		Person p3 = new Person(8, "Anil", 5.5);
		Person p4 = new Person(4, "Sneha", 5.3);
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		PersonByHeight phi =new PersonByHeight();
		PersonById pid = new PersonById();
		PersonByName pn = new PersonByName();
		Collections.sort(li, pn);
		
		Iterator<Person> it = li.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.height);
			System.out.println("--------------------");
		}

	}
}
