package com.capgemini.javafullstack.polymorphism;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(22);
		s1.setName("Shalini");
		s1.setHeight(5.2);
		
		Student s2 = new Student();
		s2.setId(37);
		s2.setName("Swetha");
		s2.setHeight(5);
		
		Student s3 = new Student();
		s3.setId(20);
		s3.setName("Varsha");
		s3.setHeight(5.1);
			
		Student s[]= new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		StudentArray a = new StudentArray();
		a.recieve(s);
		
		
	}
}
