package ch07.lab;

// �������
class BankAccount {
	int balance; // �ܾ��� ǥ���ϴ� ����

	// ����
	void deposit(int amount) {
		balance += amount;
	}

	//	 ���� (�ܰ� ������ �� ���� ���� �Ұ�)
	void withdraw(int amount) {
		if (balance-amount < 0) {
			System.out.println("�ܰ� �����մϴ�.");
		} else {
			balance -= amount;
		}
	}

	// �ܰ� ��ȯ
	int getBalance() {
		return balance;
	}

	// ���� �ܾ׿� ���Ͽ� �� 7.5%�� ���ڸ� ����Ͽ� �߰��ϴ� �޼ҵ�
	void addInterest() {
		balance += balance * 0.075;
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();

		b.deposit(100); // b�� �ܰ� 100���� �Ѵ�.
		b.withdraw(160); // b���� 60�� �����Ѵ�.
		//b.addInterest();
		System.out.println("���� �ܰ�: "+b.getBalance()); // b�� ���� �ܰ� �� ȭ�鿡 ����Ѵ�.
	}

}


/*
 * 4) BankAccount Ŭ���� �տ� public�� �߰��ϰ� ���α׷��� �������غ���. � ������ �߻��ϴ°�? 
 * public�� ���̴� �Ͱ� ������ �ʴ� ���� ���̴� �����ΰ�?
 * -> �Ʒ��� ���� ���� ������ �߻��Ѵ�.
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * The public type BankAccount must be defined in its own file
 * 
 * at ch07.lab.BankAccount.<init>(BankAccountTest.java:4)
 * at ch07.lab.BankAccountTest.main(BankAccountTest.java:35)
 * 
 * �ڹٿ����� ���ϸ����� ���ǵ� Ŭ�������� public�� ������ �� �ִ�.
 * public ���������ڰ� ���� ����, �޼ҵ�� � Ŭ���������� ������ �����ϴٴ� ���� �ǹ��Ѵ�.
 * */
