package account.model.child;

import account.model.Account;

public class CurrentAccount extends Account{
	
	private final static double OVER_DRAFT = 25000;
	public CurrentAccount(int id, String name, int balance) {
		super(id, name, balance);
	}
	
	@Override 
	public boolean withdraw (double amount) {
		if ((balance - amount >= -OVER_DRAFT)) { 
			balance = balance - amount;
			return true;
		} 
		return false;
	}
	
}
