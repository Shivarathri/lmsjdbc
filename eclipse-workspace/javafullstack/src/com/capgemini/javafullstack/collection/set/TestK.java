package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestK implements Mystudent{
	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<Student>(comByName);
		
		Student s1 = new Student(1, "Shalini", 74.0);
		Student s2 = new Student(6, "Sai", 72.0);
		Student s3 = new Student(3, "Soumya", 87.9);
		Student s4 = new Student(8, "Supriya", 76.4);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()) {
			Student r = it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
			System.out.println("-----------------s");
		}
	}
}
