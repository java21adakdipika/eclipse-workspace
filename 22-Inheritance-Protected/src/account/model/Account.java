package account.model;

public abstract class Account {
	
	protected int id;
	protected String name;
	protected double balance;
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public boolean deposit(double amount) {
		if (amount>0) {
			  balance = balance + amount ;
			  return true;
		 }
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public abstract boolean withdraw(double amount); // Abstra

}
