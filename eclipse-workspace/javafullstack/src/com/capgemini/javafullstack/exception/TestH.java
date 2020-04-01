package com.capgemini.javafullstack.exception;

import java.io.IOException;

public class TestH {
	public static void main(String[] args) {
		System.out.println("main started");
		MusicPlayer p = new MusicPlayer();
		
		try {
			p.produce();
			System.out.println("------");
		}catch(IOException e) {
			System.out.println("caught");
		}
		
		System.out.println("ended");
	}
}
