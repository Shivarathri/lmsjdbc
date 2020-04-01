package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestS {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 =new Student(9, "Shalini", 74.4);
		Student s2 =new Student(4, "Swetha", 83.5);
		Student s3 =new Student(1, "Sai", 82.9);
		Student s4 =new Student(6, "Varsha", 70.6);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student r = it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
			System.out.println("------------------");
		}
	}
}
