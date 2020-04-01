package com.capgemini.javafullstack.abstraction;

public class ATMMachine {
	void slot(ATM a) {
		a.validateCard();
		a.getAccountInfo();
	}
}
