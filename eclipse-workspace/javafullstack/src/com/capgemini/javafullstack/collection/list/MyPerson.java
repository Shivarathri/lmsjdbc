package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public interface MyPerson {
	Comparator<Person> comById = (p1,p2) ->{
		if(p1.id > p2.id) {
			return 1;
		}else if(p1.id< p2.id) {
			return -1;
		}else {
			return 0;
		}
	};
	
	Comparator<Person> comByHeight = (p1,p2) ->{
		if(p1.height > p2.height) {
			return 1;
		}else if(p1.height< p2.height) {
			return -1;
		}else {
			return 0;
		}
	};
	
	Comparator<Person> comByName = (p1,p2) ->{
		return p1.name.compareTo(p2.name);
	};
	
}
