package com.capgemini.javafullstack.object;

public class Remote implements Cloneable {
	int cost;
	String name;
	
	//Over riding clone() 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
