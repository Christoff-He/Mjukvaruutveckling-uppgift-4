package uppgift4;


public class Account {
	
	private String nbr;
	private static double balance;
	
	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}

	public String getNbr() {
		return nbr;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}
	
	static void credit(double amount) {
		setBalance(getBalance() + amount);
	} 
	
	static void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
	
}

