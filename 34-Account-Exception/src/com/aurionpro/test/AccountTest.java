package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalance;

public class AccountTest {

	public static void main(String[] args) {
	      Account acc=new Account(1, "Dipika", 1000);
	      System.out.println("Account Details " + acc);
	      
//	      acc.deposit(200);
//	      System.out.println("After deposit: " + acc.getBalance());

	      try {
	      acc.withdraw(260);
	      System.out.println("Your balance is "+acc.getBalance());
	      }
	      catch(InsufficientBalance e) {
	    	  System.out.println(e);
	      }
	}

}
