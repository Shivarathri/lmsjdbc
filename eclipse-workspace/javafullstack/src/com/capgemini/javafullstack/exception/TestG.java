package com.capgemini.javafullstack.exception;

import java.io.File;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		File f = new File("D:/Porika.txt");
		try {
			f.createNewFile();
			System.out.println("File Created");
		}catch(IOException e) {
			System.out.println("Sorry could not create the file");
		}
		
		System.out.println("Main Ended");
	}
}
