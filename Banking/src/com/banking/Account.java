package com.banking;

public abstract class Account {
	
	private long balance;
	private String holderName;
	
	public Account(String holderName){
		this.holderName = holderName;
	}
	
	public final void transaction(String message, long amount) {
		System.out.printf("For user: %s, %s with transaction amount: %d\n", this.holderName, message, amount);
		this.balance += amount;
	}
	
	public long getBalance(){
		return this.balance;
	}
	
	abstract boolean deposit(long amount);
	
	abstract boolean withdraw(long ammount);
}
