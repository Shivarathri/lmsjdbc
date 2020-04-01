package com.capgemini.javabasics.constructors;

public class Subclass extends Superclass {
	String s="sub class variable";
	void submethod() {
		System.out.println(s);
		System.out.println("s value is="+this.s);
		System.out.println("s value is="+super.s);
		System.out.println("===================");
		System.out.println("sub class method");
	}
	public static void main(String[] args) {
		Subclass s=new Subclass();
		s.submethod();
		
	}

}
