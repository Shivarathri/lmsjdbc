package com.capgemini.javafullstack.abstraction;

public class TestB {
	public static void main(String[] args) {
		ATMMachine m = new ATMMachine();
		//HDFC h =  new HDFC();
		//m.slot(h);
		
		ATM s = new SBI();
		m.slot(s);
	}
}
