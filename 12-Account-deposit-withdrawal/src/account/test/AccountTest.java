package account.test;

import account.model.AccountType;

import account.model.Account;
import account.model.*;

public class AccountTest {

 public static void main(String[] args) {
  
		Account account = new Account();
		account.setBalance(100);
		account.setId(1);
		account.setName("Rasika");
		account.setAccount(AccountType.SAVINGS);

		System.out.println(account);
		deposite(2000, account); // 2100

		System.out.println(account);
		WithDraw(2000, account, AccountType.SAVINGS); // 100
		
		System.out.println(account);
		WithDraw(12000, account, AccountType.SAVINGS);
		System.out.println(account);

		Account account1 = new Account();
		account1.setBalance(100); // 100
		account1.setId(1);
		account1.setName("Rasika");
		account1.setAccount(AccountType.CURRENT);

		System.out.println(account1);
		deposite(2000, account1); // 2100
		
		System.out.println(account1);
		WithDraw(2000, account1, AccountType.CURRENT); ////////////////////
		
		System.out.println(account1);
		WithDraw(12000, account1, AccountType.CURRENT);
		System.out.println(account1);
		WithDraw(13100, account1, AccountType.CURRENT);
		System.out.println(account1);
		WithDraw(1, account1, AccountType.CURRENT);
		System.out.println(account1);

 }
 
  private static void deposite(double amount, Account account) { 
	  if (amount>0) {
		  double update = account.getBalance(); // update = 100
		  update = update + amount ; //100 + 2000 = 2100
		  account.setBalance(update);
	  }
  }
  
	private static void WithDraw(double amount, Account account, AccountType type) {
		
		if (AccountType.SAVINGS.equals(type)) {
			
			if (amount > account.getBalance()) { // amount = 2000 > 2100
				System.out.println("WithDraw failed");
			} else {
				double update = account.getBalance(); // update = 2100
				update = update- amount; // update = 2100 - 2000 = 100
				account.setBalance(update); // 100
				System.out.println("Withdraw Success");
			}
		}
   
		if (AccountType.CURRENT.equals(type)) {
			
			if ((account.getBalance() - amount >= (-25000))) { // 100 >= -25000
				double update = account.getBalance(); // update = 2100 
				update -= amount; // update = 2100 -2000
				account.setBalance(update);
				System.out.println("Withdraw Success");
			} else {
				System.out.println("Failed");

			}

		}
	}

}

