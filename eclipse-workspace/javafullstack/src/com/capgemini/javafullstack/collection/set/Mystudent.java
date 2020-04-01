package com.capgemini.javafullstack.collection.set;

import java.util.Comparator;

public interface Mystudent {
	Comparator<Student> comById = (p1,p2) ->{
		if(p1.id > p2.id) {
			return 1;
		}else if(p1.id< p2.id) {
			return -1;
		}else {
			return 0;
		}
	};
	
	Comparator<Student> comByPer = (p1,p2) ->{
		if(p1.percentage > p2.percentage) {
			return 1;
		}else if(p1.percentage< p2.percentage) {
			return -1;
		}else {
			return 0;
		}
	};
	
	Comparator<Student> comByName = (p1,p2) ->{
		return p1.name.compareTo(p2.name);
	};
	
}
