package com.banking;
import static java.lang.System.out;


public class Banking {

	public static void main(String[] args) {
		Account[] accounts = {
				new MortgageAccount("Bob", 100000), 
				new CheckingAccount("John", 200), 
				new CheckingAccount("Jane", 1000)
		};
		
		for (Account a : accounts) {
			out.println("Deposit 1000");
			out.println(a.deposit(1000));
			out.println("New Balance: " + a.getBalance());
			
			out.println("Withdraw 500");
			out.println(a.withdraw(500));
			out.println("New Balance: " + a.getBalance());
			
			out.println("Withdraw 1000");
			out.println(a.withdraw(1000));
			out.println("New Balance: " + a.getBalance());
			
			out.println("Withdraw 2000");
			out.println(a.withdraw(2000));
			out.println("New Balance: " + a.getBalance());
		}
	}

}
