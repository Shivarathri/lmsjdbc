package com.capgemini.javafullstack.abstraction;

public class HDFC implements ATM {

	@Override
	public void validateCard() {
		System.out.println("*****Validating Card******");
		System.out.println("HDFC Card is Validated");
	}

	@Override
	public void getAccountInfo() {
		System.out.println("******Get Card Info******");
		System.out.println("Getting acc info from acc holder");
	}

}
