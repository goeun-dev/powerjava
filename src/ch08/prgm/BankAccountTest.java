package ch08.prgm;

// 6번
class BankAccount { // 은행 계좌
	int accountNumber; // 계좌 번호
	String owner; // 예금주
	int balance; // 잔액을 표시하는 변수

	void deposite(int amount) { // 저금
		balance += amount;
	}

	void withdraw(int amount) { // 인출
		balance -= amount;
	}

	// 현재 객체의 잔액에서 amount 만큼을 otherAccount 계좌로 송금한다.
	public String transfer(int amount, BankAccount otherAccount) {
		if (balance >= amount) {
			this.balance -= amount;
			otherAccount.balance += amount;
			return balance + "원을 이체하였습니다.";
		} else {
			return "잔액이 부족합니다.";
		}
	}

	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}

}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		BankAccount otherAccount = new BankAccount();
		myAccount.deposite(1000);

		myAccount.transfer(800, otherAccount);

		System.out.println("myAccount: " + myAccount);
		System.out.println("otherAccount: " + otherAccount);
	}

}
