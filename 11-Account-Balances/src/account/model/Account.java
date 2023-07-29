package account.model;

public class Account {
	
	private int id;
	private String name;
	private double balance;
	private AccountType accounttype;
	
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accounttype=" + accounttype + "]";
	}
	
	
}
