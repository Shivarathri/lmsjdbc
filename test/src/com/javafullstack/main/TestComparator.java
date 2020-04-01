package com.javafullstack.main;

import java.util.ArrayList;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();
			
		al.add(new Employee("zzz","9876543210"));
		al.add(new Employee("bbb","6669543210"));
		al.add(new Employee("aaa","7776543210"));
		for (Employee e : al) {
			System.out.println(e.name+"........"+e.phone);
		}
	}

}
