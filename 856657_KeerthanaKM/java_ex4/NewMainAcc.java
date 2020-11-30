package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class NewMainAcc {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		ServiceAcc sa=new ServiceAcc();
		System.out.println("Menu: ");
		System.out.println("1.Add Account Details");
		System.out.println("2.Remove account by account number");
		System.out.println("3.Display account by account number");
		System.out.println("4.Display all account details");
		System.out.println("5.Display those account having the balance less than 1000");
		System.out.println("6.Exit");
		
		int choice;
		do {
			System.out.println("Enter choice:");
			choice=s.nextInt();
			switch(choice) {
			
				case 1: {
				
					System.out.println("Enter account details(account number, name,balance):");
					int accno= s.nextInt();
					String name=s.next();
					double balance=s.nextDouble();
					
					
					Accounts acc=new Accounts();
					acc.setAccno(accno);
					acc.setName(name);
					acc.setBalance(balance);
					
					try {
						sa.addAccount(acc);
					} catch (AccountAlreadyException e) {
						// TODO Auto-generated catch block
						e.printMessage();
					}
					break;
				}
				
				case 2: {
					System.out.println("Enter the account number to be removed:");
					int ano= s.nextInt();
					
					try {
						sa.removeAccounts(ano);
					} catch (AccountNotFoundException e) {
						// TODO Auto-generated catch block
						e.printMsg();
					}
					System.out.println("Removed account with account number "+ano);
					break;
				}
				
				case 3:{
					System.out.println("Enter the account number to display the details:");
					int ano= s.nextInt();
					
					try {
						sa.findAccountByNo(ano);
					} catch (AccountNotFoundException e) {
						// TODO Auto-generated catch block
						e.printMsg();
					}
					break;
				}
				
				case 4:{
					System.out.println("List of all the accounts:");
					sa.getAllAccount();
					break;
				}
				
				case 5:{
					System.out.println("Accounts having balance less than 1000");
					sa.balanceCondition();
					break;
				}
				
			}
		}while(choice!=6);
		
		
		
	}

}
