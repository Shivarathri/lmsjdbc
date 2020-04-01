package com.capgemini.javafullstack.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestK {
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the name");
			String name = scan.nextLine();
			System.out.println("Name is "+name);
		}
		catch(InputMismatchException im) {
			im.printStackTrace();
		}finally {
			System.out.println("Ended");
		}
	}
}
