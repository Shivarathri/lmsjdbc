package com.capgemini.javafullstack.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileReader {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("db.properties");
			Properties p = new Properties();
			p.load(fis);
			p.getProperty("user");
			p.getProperty("password");
			System.out.println("user....>"+p.getProperty("user"));
			System.out.println("password...>"+p.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
