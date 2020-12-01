package com.example;

import java.util.ArrayList;
import java.util.List;

public class ServiceAcc implements AccountDao {
	
	private static List<Accounts> list = new ArrayList<Accounts>();
	
	@Override
	public void addAccount(Accounts acc) throws AccountAlreadyException {
		for(Accounts ac:list) {
			if(ac.getAccno()==acc.getAccno()) {
				throw new AccountAlreadyException();
			}
		}
		list.add(acc);
	}
	
	@Override
	public void findAccountByNo(int no) throws AccountNotFoundException {
		int flag = 0;
		for(Accounts acc:list) {
			if(acc.getAccno()==no) {
				flag= flag+1;
				System.out.println(acc);
			}
		}
		if(flag ==0) {
			throw new AccountNotFoundException();
		}
	}
	
	public void getAllAccount() {
		for(Accounts acc:list) {
			System.out.println(acc);
		}
	}
	
	@Override
	public void removeAccounts(int no) throws AccountNotFoundException {
		int flag=0;
		for(Accounts acc:list) {
			if(acc.getAccno()==no) {
				flag = 1;
				list.remove(acc);
			}
		}
		if(flag==0) {
			throw new AccountNotFoundException();
		}
		
	}
	
	@Override
	public void balanceCondition() {
		for(Accounts acc:list) {
			if(acc.getBalance()<1000) {
				System.out.println(acc);
			}
		}
	}

}
