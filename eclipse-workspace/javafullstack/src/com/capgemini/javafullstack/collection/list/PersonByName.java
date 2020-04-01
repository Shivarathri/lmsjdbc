package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public class PersonByName implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
	
}
