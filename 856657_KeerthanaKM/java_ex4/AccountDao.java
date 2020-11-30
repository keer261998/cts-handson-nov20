package com.example;

public interface AccountDao {
	
	public void addAccount(Accounts acc) throws AccountAlreadyException;
	public void removeAccounts(int no) throws AccountNotFoundException;
	public void findAccountByNo(int no)throws AccountNotFoundException;
	public void balanceCondition();

}
