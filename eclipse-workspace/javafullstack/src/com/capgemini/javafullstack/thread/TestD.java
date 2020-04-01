package com.capgemini.javafullstack.thread;

public class TestD {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Pen p = new Pen();
		p.setDaemon(true);
		p.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
	} 
}
