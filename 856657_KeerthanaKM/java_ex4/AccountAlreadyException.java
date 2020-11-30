package com.example;

public class AccountAlreadyException extends Exception {
	
	public void printMessage() {
		System.out.println("Account already exits with this account number");
	}

}
