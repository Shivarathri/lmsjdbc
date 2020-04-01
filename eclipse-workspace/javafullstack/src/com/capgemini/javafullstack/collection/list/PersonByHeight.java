package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public class PersonByHeight implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.height > p2.height) {
			return 1;
		}else if(p1.height <p2.height) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
