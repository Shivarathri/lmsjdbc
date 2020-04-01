package com.capgemini.javafullstack.thread;

public class TestC {
	public static void main(String[] args) {
		Marker m = new Marker();
		Thread t = new Thread(m);
		
		t.start();
	}
}
