package account.test;

import java.util.Scanner;


import account.model.Account;
import account.model.AccountType;

public class AccountTest {
	
	int id;
	String name;
	double balance;
	AccountType accounttype;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account[] accounts = {
				new Account(1, "Dipika", 5000, AccountType.CURRENT),
				new Account(2, "Lipika", 7000, AccountType.SAVINGS),
				new Account(3, "Mipika", 9000, AccountType.CURRENT),
				new Account(4, "Fipika", 11000, AccountType.SAVINGS),
		};
		
		
		Account highestBalanceAccount = findHighestBalanceAccount(accounts); // Account(3, "Mipika", 9000, AccountType.CURRENT)
		System.out.println("Account with Highest Balance: " + highestBalanceAccount);
		
		Account highestCurrentBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.CURRENT);
		System.out.println("\nCurrent Account with Highest Balance: " + highestCurrentBalanceAccount);
		
		Account highestSavingsBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.SAVINGS);
		System.out.println("\nSavings Account with Highest Balance: " + highestSavingsBalanceAccount);
		
		double findSum = findSum(accounts);
		System.out.println("Sum of all account balances is " + findSum);
		
		double findSavings = findSumSavings(accounts, AccountType.SAVINGS);
		System.out.println("Sum of all Savings account balances is " + findSavings);
		
		double findSavingss = findSumSavings(accounts, AccountType.CURRENT);
		System.out.println("Sum of all Current account balances is " + findSavingss);
		
		sortAccountsArrayBySalary(accounts);
		for(Account acc : accounts){
			System.out.println(acc);
		}
		
		
	}
	
	
	
	private static Account findHighestBalanceAccount(Account[] accounts) {
		Account maxAccount = accounts[0];  // new Account(3, "Mipika", 9000, Account(3, "Mipika", 9000, AccountType.CURRENT))
		
		for (int i=0; i < accounts.length; i++) { // i = 4
			
			if (accounts[i].getBalance() > maxAccount.getBalance()) {  // 4000 > 9000
				maxAccount = accounts[i];
			}
			
		}
		
		return maxAccount;
	}
	
	
	private static Account findHighestBalanceAccountInAccountType(Account[] accounts, AccountType type) { // type = Savings
		Account maxAccount = null; // Account(2, "Lipika", 7000, AccountType.SAVINGS)
		
		for (int i=0; i<accounts.length; i++) {
			if (accounts[i].getAccountType().equals(type)) {
				maxAccount = accounts[1];
				break;
			}
		}
		
		for (int i=0; i<accounts.length; i++) {
			if (accounts[i].getAccountType().equals(type) && accounts[i].getBalance() > maxAccount.getBalance()) { // 11000 > 7000
				maxAccount = accounts[i];
			}
		}
		
//		
//		for (int i=0; i<accounts.length; i++) {
//			if (maxAccount==null && accounts[i].getAccountType().equals(type)) {
//				maxAccount=accounts[i];
//			}
//			
//			if (maxAccount != null) {
//				if (accounts[i].getBalance() > maxAccount.getBalance() && accounts[i].getAccountType().equals(type)) {
//					maxAccount = accounts[i];
//				}
//			}
//		}
		
		return maxAccount;
	}
	
	private static void sortAccountsArrayBySalary(Account[] accounts) {
		Account temp = null;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[i].getBalance()>accounts[j].getBalance()) {
					temp=accounts[i];
					accounts[i]=accounts[j];
					accounts[j]=temp;
				}
			}
			
		}
	}
	
	private static double findSum(Account[] accounts) {
		
		double sumBalance=0;
		
		for (int i=0; i < accounts.length; i++) {
			sumBalance = sumBalance + accounts[i].getBalance();
		}
		return sumBalance;
	}
	
	private static double findSumSavings(Account[] accounts, AccountType type) { // type = Current
		double sumBalance=0;
		
		for (int i=0; i < accounts.length; i++) {
			if (accounts[i].getAccountType().equals(type)) {
				sumBalance = sumBalance + accounts[i].getBalance();
			}
		}
		return sumBalance;
	}

}
