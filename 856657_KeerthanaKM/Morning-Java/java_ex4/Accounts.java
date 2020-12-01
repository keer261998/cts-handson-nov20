package com.example;

public class Accounts {
	
	private int accno;
	private String name;
	private double balance;

	
	public Accounts(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*public int hashCode()
	{
		return accno;
	}
	
	public boolean equals(Object obj) {
		Accounts other = (Accounts) obj;
		return this.accno == other.getAccno();
	}*/


	@Override
	public String toString() {
		return "Accounts [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	

	
}
