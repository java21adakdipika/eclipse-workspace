package account.model;

public class Account {
	
	private final int id;
	private final String name;
	private final double balance;
	private final AccountType accounttype;
	
	public double highestbalance = 0;

	public Account(int id, String name, double balance, AccountType accounttype) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accounttype = accounttype;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountType(AccountType accounttype) {
		this.accounttype = accounttype;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public boolean withdraw(double amount) {
		  if (accounttype.equals(AccountType.SAVINGS)) {   
			  if (balance - amount > 0) {
				  this.balance -= amount;    return true;
		   }   return false;
		  } else {   if (balance - amount > -25000) {
		    this.balance -= amount;    return true;
		   }   return false;
		  }
	}
	
	public double getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAccountType() {
		return this.accounttype;
	}
	
	public static int count = 0;

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accounttype=" + accounttype + "]";
	}
}
