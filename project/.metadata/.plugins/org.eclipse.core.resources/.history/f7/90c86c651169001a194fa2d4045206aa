package com.capgemini.librarymanagementjdbc.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementjdbc.dto.UsersBean;
import com.capgemini.librarymanagementjdbc.factory.UserFactory;
import com.capgemini.librarymanagementjdbc.service.UsersService;

public class Test2 {
	public static void main(String[] args) {
		doReg();
	}
	public static void doReg() {
		Scanner scanner = new Scanner(System.in);
		do {
			UsersService service = UserFactory.getAdminService();
			System.out.println("press 1 for registration");
			System.out.println("press 2 for login");
			int a = scanner.nextInt();
			switch (a) {

			case 1:
				System.out.println("Enter ID");
				int regID = scanner.nextInt();
				System.out.println("Enter Name");
				String regName = scanner.next();
				System.out.println("Enter Mobile");
				String regMobile = scanner.next();
				System.out.println("Enter Email");
				String regEmail = scanner.next();
				System.out.println("Enter Password");
				String regPassword = scanner.next();
				System.out.println("Enter role");
				String regRole = scanner.next();

				UsersBean bean = new UsersBean();
				bean.setUid(regID);
				bean.setUname(regName);
				bean.setMoblie(regMobile);
				bean.setEmail(regEmail);
				bean.setPassword(regPassword);
				bean.setRole(regRole);
				boolean check = service.register(bean);
				if(check) {
					System.out.println("Email already exist");
				} else {
					System.out.println("registered");
				}
				break;

			case 2:
				System.out.println("Enter Email");
				String regEmail1 = scanner.next();
				System.out.println("Enter Password");
				String regPassword1 = scanner.next();
				try {
					UsersBean check1 = service.auth(regEmail1, regPassword1);
					if(check1!=null) {
						System.out.println("Login successful");
					} else {
						System.out.println("login failed");
					}

				}
				catch (Exception e) {
					System.out.println("Invalid Credentials");
				}
			case 3:
				doReg();

			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while(true);
	}
}
