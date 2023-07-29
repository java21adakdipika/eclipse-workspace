package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new Account(101, "Dipika", 20000));
		accounts.add(new Account(102, "Vedika", 70000));
		System.out.println(accounts);
		
		accounts.remove(0);
		
		for(Account account:accounts) {
			System.out.println(account.getName());
		}
		
		Iterator<Account> iterator = accounts.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getBalance());
		}

	}

}
