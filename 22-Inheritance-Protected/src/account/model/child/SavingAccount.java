package account.model.child;

import account.model.Account;

public class SavingAccount extends Account {
	
	private final static double MIN_BALANCE = 1000;
	
	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
	}
	
	@Override 
	public boolean withdraw (double amount) {
		if (balance > amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	
	

}
