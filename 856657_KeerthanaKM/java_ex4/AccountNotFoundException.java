package com.example;

public class AccountNotFoundException extends Exception {
	
	public void printMsg() {
		System.out.println("Account not found with the given account number");
		
	}

}
