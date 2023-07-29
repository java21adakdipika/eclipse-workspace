package account.test;

import account.model.Account;
import account.model.child.CurrentAccount;
import account.model.child.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
//		Account acc1 = new Account(1, "Dipika", 5000);
		Account acc2 = new SavingAccount(2, "Niharika", 3000);
		Account acc3 = new CurrentAccount(3, "Mahima", 5000);
		System.out.println("Current Account Balance " + acc2);
		System.out.println("Savings Account Balance " + acc3);
		
//		acc1.deposit(2000);
		acc2.deposit(1000);
		acc3.deposit(1000);
		
//		System.out.println("Account after Deposit " + acc1.getBalance());
		System.out.println("Current Account after Deposit " + acc2);
		System.out.println("Savings Account after Deposit " + acc3);
		
		acc2.withdraw(2000);
		System.out.println("Current Account after withdrawal " + acc2);
		
		acc3.withdraw(2000);
		System.out.println("Saving Account after withdrawal " + acc3);
		
//		System.out.println("**********************************************");
//		printAccountDetails(acc3);
	}
	
//	private static void printAccountDetails(Account account) {
//		System.out.println(account.getId());
//		System.out.println(account.getName());
//		System.out.println(account.getBalance());
//	}

}
