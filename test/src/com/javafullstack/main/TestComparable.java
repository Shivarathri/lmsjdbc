package com.javafullstack.main;

import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
public static void main(String[] args) {
	Set<Employee> s = new TreeSet<Employee>();
	s.add(new Employee("zzz","9876543210"));
	s.add(new Employee("bbb","6669543210"));
	s.add(new Employee("aaa","7776543210"));
	for(Employee e : s) {
	System.out.println(e.name +"........"+e.phone);
	}
	
}
}
