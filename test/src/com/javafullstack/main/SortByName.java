package com.javafullstack.main;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.phone.compareTo(e1.name);
}
}
