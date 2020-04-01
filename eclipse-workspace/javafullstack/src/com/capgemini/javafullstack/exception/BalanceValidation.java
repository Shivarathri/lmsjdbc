package com.capgemini.javafullstack.exception;

public class BalanceValidation {
	void verify(int amount) {
		if(amount > 10000) {
			throw new DailyLimitException("limit crossed");
			//throw new DailyLimitException("Daily limit crossed");
		}
	}
}
