package account.test;

import java.util.Scanner;


import account.model.Account;
import account.model.AccountType;

public class AccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double highestbalance = 0;
		
		Account accounts = new Account(4, "Priyanka", 4000, AccountType.SAVINGS);
		Account accounts1 = new Account(3, "Dipika", 2000, AccountType.SAVINGS);
		Account accounts2 = new Account(2, "Mahima", 5000, AccountType.SAVINGS);
		
		withdrawAmount(accounts, 500);
		
		
	}
	
	private static void withdrawAmount(Account savingsAccount, double amount) {  
		if (savingsAccount.withdraw(amount)) {
		   System.out.println("Withdrawal is successful");  } else {
		   System.out.println("Insufficient balance");  }
	}

}
