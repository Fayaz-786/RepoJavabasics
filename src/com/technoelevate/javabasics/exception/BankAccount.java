package com.technoelevate.javabasics.exception;

public class BankAccount {
	double balance;
	BankAccount(double balance){
		this.balance=balance;
	}
	public void withdraw(double amount) {
		if(this.balance>=amount) {
			this.balance=this.balance-amount;
			System.out.println("with draw amount"+amount);
			System.out.println("remaining balance"+this.balance);
		}
		else {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		
	}

}
