package com.technoelevate.javabasics.exception;

public class BankTest {

	public static void main(String[] args) {
BankAccount bankAccount=new BankAccount(50000);

try {
	bankAccount.withdraw(60000);
} catch (Exception e) {
	//e.printStackTrace();
	System.out.println(e.getMessage());
}

	}

}
