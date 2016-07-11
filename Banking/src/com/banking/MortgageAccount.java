package com.banking;

public class MortgageAccount extends Account {
	
	String holderName;
	long amountBorrowed;
	
	public MortgageAccount(String holderName, long amountBorrowed) {
		super(holderName);
		this.holderName = holderName;
		this.amountBorrowed = amountBorrowed;
		transaction("Initial Borrowed Amount", amountBorrowed);
	}

	@Override
	boolean deposit(long amount) {
		transaction("Mortgage Payment", -1*amount);
		return true;
	}

	@Override
	boolean withdraw(long amount) {
		return false;
	}

}
