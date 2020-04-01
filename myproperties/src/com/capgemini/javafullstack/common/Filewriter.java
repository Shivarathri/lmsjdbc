package com.capgemini.javafullstack.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Filewriter {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("first.properties");
			Properties pro = new Properties();
			pro.setProperty("name", "Ravi");
			pro.setProperty("email", "shivarathriteja8@gmail.com");
			pro.store(fos, "comments");
			System.out.println("Properties file created");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
