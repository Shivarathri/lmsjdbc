package com.capgemini.javafullstack.abstraction;

public class Gmail extends Google{
	void SendMail() {
		System.out.println("SendMail in Gmail upto 25MB");
	}
}
