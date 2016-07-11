package com.banking;

public class CheckingAccount extends Account {
	String holderName;
	long overdraftAmount;
	
/*	public CheckingAccount(String holderName) {
		super(holderName);
		this.holderName = holderName;
	}*/
	
	public CheckingAccount(String holderName, long overdraftAmount) {
		super(holderName);
		this.holderName = holderName;
		this.overdraftAmount = overdraftAmount;
	}
	
	

	@Override
	boolean deposit(long amount) {
		transaction("Checking deposit", amount);
		return true;
	}

	@Override
	boolean withdraw(long amount) {
		long endingBalance = this.getBalance() - amount;
		if (endingBalance >= 0) {
			transaction("Checking Withdrawl", -1*amount);
			return true;
		}
		else if (endingBalance >= -1 * this.overdraftAmount) {
			transaction("Checking Withdrawl", -1*amount);
			return true;
		}
			
		return false;
	}

}
