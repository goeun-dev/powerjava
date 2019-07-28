package ch09.prgm;

// PROGRMMING 05
public class BankAccount {
	private String name, account;
	private int balance;
	private double rate;

	public BankAccount(String name, String account, int balance, double rate) {
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.rate = rate;
	}

	public BankAccount() {

	}
}
