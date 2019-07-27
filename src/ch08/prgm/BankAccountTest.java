package ch08.prgm;

// 6��
class BankAccount { // ���� ����
	int accountNumber; // ���� ��ȣ
	String owner; // ������
	int balance; // �ܾ��� ǥ���ϴ� ����

	void deposite(int amount) { // ����
		balance += amount;
	}

	void withdraw(int amount) { // ����
		balance -= amount;
	}

	// ���� ��ü�� �ܾ׿��� amount ��ŭ�� otherAccount ���·� �۱��Ѵ�.
	public String transfer(int amount, BankAccount otherAccount) {
		if (balance >= amount) {
			this.balance -= amount;
			otherAccount.balance += amount;
			return balance + "���� ��ü�Ͽ����ϴ�.";
		} else {
			return "�ܾ��� �����մϴ�.";
		}
	}

	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
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
