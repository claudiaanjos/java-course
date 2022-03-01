package exercise1;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
				
	}
}
