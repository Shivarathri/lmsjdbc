package com.capgemini.javafullstack.thread;

public class TestB {
	public static void main(String[] args) {
		BMS b = new BMS();
		System.out.println("Main Started");
		User u = new User(b);
		
		u.start();
		
		User s = new User(b);
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		User o = new User(b);
		o.start();
		
		System.out.println("Main Ended");
	}
}
